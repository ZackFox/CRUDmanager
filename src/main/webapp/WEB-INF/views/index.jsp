<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
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
								<textarea class="task-text" name="task-text">${task.text}</textarea>
								<input type="text" name="task-date" value="<fmt:formatDate value="${task.date}" type="date" pattern="dd-MM-yyyy"/>" placeholder="00-00-0000">
								<input type="text" name="task-time" value="<fmt:formatDate value="${task.date}" type="time" pattern="HH:mm"/>" placeholder="00:00">
								<input class="btn btn-success" type="submit" value="Записать">
						</form>
					</div>

					<div class="col-md-6 list-task">
						<c:forEach var="taskItem" items="${tasklist}">
							<div class="task">
								<span class="task-date">
									<fmt:formatDate value="${taskItem.date}" type="date" dateStyle="long" pattern="E - dd MMMM"/>
								</span>
								<p>${taskItem.text}</p>
								<span class="task-time">
									<fmt:formatDate value="${taskItem.date}" type="time" pattern="HH:mm"/>
								</span>
								<a href="<c:url value="/update/${taskItem.id}"/>" class="btn-task btn-edit fa-pencil"></a>
								<a href="<c:url value="/remove/${taskItem.id}"/>"class="btn-task btn-del fa-trash"></a>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="win">
				<a href="/">delete</a>
			</div>
		</body>

		<footer>

		</footer>

		<script src="/resources/core/js/jquery-1.11.2.min.js"></script>
		<%--<script src="/resources/core/js/scripts.js"></script>--%>

	</html>
