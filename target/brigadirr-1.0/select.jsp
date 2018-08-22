<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<head>
    <meta charset="UTF-8">
    <title>Раковины</title>
    <link rel="stylesheet" type="text/css" href="css/style_list.css">
    <!--link rel="stylesheet" type="text/css" href="style_index.css"-->
    <link href="https://fonts.googleapis.com/css?family=Gugi" rel="stylesheet">
    <script type="text/javascript">
        function showElement(layer) {
            var myLayer = document.getElementById(layer);
            if (myLayer.style.display == "none") {
                myLayer.style.display = "block";
                myLayer.backgroundPosition = "top";
            }
            else {
                myLayer.style.display = "none";
            }
        }
    </script>
</head>
<body>
<header>

    <span class="main_name">BRIGADIRR</span>
    <div class="menu" onclick="javascript:showElement('v-menu')">
        <img src="images/menu.png" class="png_menu">
        <a href="autorization.html" id="v-menu" class="v-menu">Вход</a>
    </div>

</header>

<c:forEach var="list" items="${list}">
<div class="labels">
    <div class="label-card">
        <div class="label-card_image-container">
            <a href="l">
                <img src="${list.picture}">
            </a>
        </div>
        <div class="label-card_name">
            <span class="H3">
                <a href="" class="link_label">
                    <c:out value="${list.name}"/>
                </a>
            </span>
            <p class="short_description">
                <c:out value="${list.article}"/>
            </p>
            <span class="label-price">
                 <c:out value="${list.price}"/>
            </span>
        </div>
    </div>
    </c:forEach>

</body>
</html>
