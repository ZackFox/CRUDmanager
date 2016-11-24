<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
								<form action="">
									<textarea class="task-text"></textarea>
								<input class="btn btn-success" type="submit" value="занести">
							</form>
						</div>
					</div>
				</div>
			</header>

			<div class="container tsk">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 list-task">
						<div class="task">
							<span class="day">Понедельник / 10 Июня</span>
							<p>Сходить в баню и купить носки</p>
							<span class="remain">15:30</span>
						</div>
					</div>
				</div>
			</div>
		</body>

	</html>
