<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>

<form action="saveLocation" method="post">
<pre>
id  : <input type="text" name="id"/>
code: <input type="text" name="code"/>
Name: <input type="text" name="name"/>
Type: Urban <input type="radio" name="type" value="Urban"/>
      Rural <input type="radio" name="type" value="Rural"/>

<input type="submit" value="Save"/>
</pre>
</form>
${msg}
<br/>
<a href="displayLocations">View all</a>
</body>
</html>