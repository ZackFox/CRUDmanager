<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
	<html lang="en">
		<head>
			<title>Менеджер задач</title>
			<link rel="stylesheet" href="/resources/core/css/bootstrap.min.css">
			<link rel="stylesheet" href="/resources/core/css/font-awesome.min.css">
			<link rel="stylesheet" href="/resources/core/css/styles.css">
		</head>

		<body>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h2>Добро пожаловать</h2>
						<p>"Менеджер задач" - это простое CRUD приложение, которое может получать данные из базы данных,
							выводить их, редактировать и удалять. Для создания задачи необходимо указать текст задачи, дату и время исполнения.
							Для редактирования необходимо нажать значок <i class="fa fa-pencil"></i>, для удаления значок <i class="fa fa-trash"></i>
						</p>

						<a href="/list">открыть Менеджер задач</a>

						<a href="https://github.com/ZackFox/CRUDmanager">открыть репозиторий GitHub</a>

						<p>В приложении использованны следующие технологии:</p>
						<ul>
							<li>Spring MVC</li>
							<li>Hibernate</li>
							<li>JSP/JSTL</li>
							<li>Bootstrap</li>
							<li>jquery/plugins</li>
							<li>PostgreSQL</li>
							<li>Maven</li>
						</ul>
					</div>
				</div>
			</div>
		</body>

		<footer>
			<a href="https://github.com/ZackFox/CRUDmanager">github</a>
			<a href="https://heroku.com">heroku.com</a>
		</footer>

		<script src="/resources/core/js/jquery-1.11.2.min.js"></script>
		<script src="/resources/core/js/scripts.js"></script>

	</html>
