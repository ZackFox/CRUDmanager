<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
	<html lang="en">
		<head>
			<title>Blabber</title>
			<link rel="stylesheet" href="/resources/core/css/bootstrap.min.css">
			<link rel="stylesheet" href="/resources/core/css/font-awesome.min.css">
			<link rel="stylesheet" href="/resources/core/css/styles.css">
		</head>

		<body>
			<header>
				<div class="container">
					<div class="row">
						<div class="col-md-3 ">
							<h2>Менеджер задач</h2>
						</div>
					</div>
				</div>
			</header>

			<div class="container tsk">
				<div class="row">
					<div class="col-md-6">
						<form action="/add" method="post">
							<textarea class="task-text" name="task-text"></textarea>
							<input type="text" name="task-date" placeholder="00-00-0000">
							<input type="text" name="task-time" placeholder="00:00">
							<input class="btn btn-success" type="submit" value="Записать">
						</form>
					</div>

					<div class="col-md-6 list-task">
						<c:forEach var="task" items="${tasklist}">
							<div class="task">
								<span class="task-date">
									<fmt:formatDate value="${task.date}" type="date" dateStyle="long" pattern="E - dd MMMM"/>
								</span>
								<p>${task.text}</p>
								<span class="task-time">
									<fmt:formatDate value="${task.date}" type="time" pattern="HH:mm"/>
								</span>

								<a href="/" id="edit_${task.id}" class="btn-task btn-edit fa-pencil"></a>
								<a href="/" id="delete_${task.id}" class="btn-task btn-del fa-trash"></a>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</body>

		<footer>

		</footer>

		<script src="/resources/core/js/jquery-1.11.2.min.js"></script>
		<script src="/resources/core/js/scripts.js"></script>

	</html>
