<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Location</title>
</head>
<body>
<form action="updateLocation" method="post">
<pre>
id  : <input type="text" name="id" value="${location.id}" readonly/>
code: <input type="text" name="code" value="${location.code}" />
Name: <input type="text" name="name" value="${location.name}"/>
Type: Urban <input type="radio" name="type" value="Urban" ${location.type=='Urban'?'checked':''}/>
      Rural <input type="radio" name="type" value="Rural" ${location.type=='Rural'?'checked':''}/>

<input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>