<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="WEB-INF/style_page.css">

</head>
<body>

<p>Добавлена  в каталог следующая позиция:</p>
<div class="labels">
    <div class="label-card">
        <div class="label-card_image-container">
            <a href="l">
                <img src="${product.picture}">
            </a>
        </div>
        <div class="label-card_name">
            <span class="H3">
                <a href="" class="link_label">
                    <c:out value="${product.name}"/>
                </a>
            </span>
            <p class="short_description">
                <c:out value="${product.article}"/>
            </p>
            <span class="label-price">
                 <c:out value="${product.price}"/>
            </span>
        </div>
    </div>
</div>
<a href="">Повторить</a>

</body>
</html>