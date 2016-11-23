<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
	<html lang="en">
		<head>
			<title>Blabber</title>
			<%--<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">--%>
			<link rel="stylesheet" href="/css/bootstrap.min.css">

		</head>

		<body>
			<div class="container">
				<a href="userwall" class="go">go to the wall</a>
				<div class="row">
					<div class="col-md-12 center-block">
						<h2>Привет Болтун! Хочешь поделиться новыми слухами?</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<form action="/" method="post" class="form-group well">
							<h4>Логин :</h4>
							<input type="text" name="name" />
							<p>Пороль :</p>
							<input type="password" name="pass" class=""/>
							<input type="submit" class="btn-primary" value="Войти"/>
							<a href="#" class="btn-success">Регистрация </a>
						</form>
					</div>
				</div>
			</div>

			<footer>

			</footer>
		</body>

	</html>
