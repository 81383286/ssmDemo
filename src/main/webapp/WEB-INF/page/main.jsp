<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>主页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
</head>
<body>
<form action="/demo/test2">
    现在
    <input name="name" value="现在">
    <input type="submit" value="提交">
</form>

<form action="/demo/test4" method="post" enctype="multipart/form-data">
    <input type="file" name="file" value="现在">
    <input type="submit" value="提交">
</form>



<script>

</script>
</body>
</html>