<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persons List</title>
</head>
<body>
<#list persons as p>
  <div> Person: ${p.name} - ${p.age} </div>
</#list>
</body>
</html>