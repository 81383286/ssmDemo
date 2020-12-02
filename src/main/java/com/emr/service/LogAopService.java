package com.emr.service;

import com.emr.annotation.testAnnotation;
import com.emr.entity.Power_Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Aspect
@Component
public class LogAopService{
    @Resource
    private PowerRoleService roleService;

    // 配置接入点，即为所要记录的action操作目录
    @Pointcut("@annotation(com.emr.annotation.testAnnotation)")
    private void controllerAspect() {
    }

    @Around("controllerAspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        // 拦截的实体类，就是当前正在执行的controller
        Object target = pjp.getTarget();
        // 拦截的方法名称。当前正在执行的方法
        String methodName = pjp.getSignature().getName();
        // 拦截的放参数类型
        Signature sig = pjp.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Class[] parameterTypes = msig.getMethod().getParameterTypes();
        Object object = null;
        // 获得被拦截的方法
        Method method = null;
        try {
            method = target.getClass().getMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        }
        if (null != method) {
            testAnnotation op = method.getAnnotation(testAnnotation.class);
            String module = op.modelName();
            System.out.println("注解属性值："+module);
            //插入表操作
            insertLog(method,pjp);
        }
        object = pjp.proceed();
        //接受客户端的数据
        Map<String,String[]> map = request.getParameterMap();
        // 解决获取参数乱码
        Map<String,String[]> newmap = new HashMap<String,String[]>();
        for(Map.Entry<String, String[]> entry : map.entrySet()){
            String name = entry.getKey();
            String[] values = entry.getValue();

            if(values==null){
                newmap.put(name, new String[]{});
                continue;
            }
            String[] newvalues = new String[values.length];
            for(int i=0; i<values.length;i++){
                String value = values[i];
                value = new String(value.getBytes("iso8859-1"),request.getCharacterEncoding());
                newvalues[i] = value; //解决乱码后封装到Map中
            }
            newmap.put(name, newvalues);
        }
        return object;
    }

    private void insertLog(Method method,ProceedingJoinPoint pjp) {
        List<Power_Role> power_roles = roleService.selectAll();
        System.out.println(power_roles.toString());
    }
}
