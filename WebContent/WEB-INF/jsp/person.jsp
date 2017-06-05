<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title - Person Info</title>
</head>
<body>
	${message}
	<div>
		<ul>
			<li>person name: ${person.name}</li>
			<li>person age : ${person.age}</li>
			<li>person height : ${person.height}</li>
			<li>person favorite : ${person.favorite}</li>
			<li>person address : ${person.address}</li>
			<li>person others : ${person.others}</li>
		</ul>
	</div>
</body>
</html>