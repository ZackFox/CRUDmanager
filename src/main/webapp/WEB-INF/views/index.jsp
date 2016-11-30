<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
	<html lang="en">
		<head>
			<title>Blabber</title>
			<link rel="stylesheet" href="/resources/core/css/bootstrap.min.css">
			<link rel="stylesheet" href="/resources/core/css/hello.css">
		</head>

		<body>
			<header>
				<div class="container">
					<div class="row">
						<div class="col-md-3 ">
							<a href="#">Менеджер задач</a>
						</div>

						<div class="col-md-8">
								<form action="/" method="post">
									<textarea class="task-text" name="task-text"></textarea>

								<input class="btn btn-success" type="submit" value="занести">
							</form>
						</div>
					</div>
				</div>
			</header>

			<div class="container tsk">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 list-task">
						<c:forEach var="task" items="${tasklist}">
							<div class="task">
								<span class="day">
									<fmt:formatDate value="${task.date}" type="date" dateStyle="long" pattern="E - dd MMMM"/>
								</span>
								<p>${task.text}</p>
								<span class="remain">
									<fmt:formatDate value="${task.date}" type="time" pattern="HH:mm"/>
								</span>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</body>

	</html>
