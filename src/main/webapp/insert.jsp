<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<header>
    <span class="main_name">BRIGADIRR</span>
    <div class="menu" onclick="javascript:showElement('v-menu')">
        <img src="images/menu.png" class="png_menu">
        <a href="autorization.html" id="v-menu" class="v-menu">Вход</a>
    </div>
</header>

<h2>Работа с каталогом</h2>

<form name="add" method="post" action="addproduct">
    <fieldset class="form">
        <legend>Panel</legend>
        <p class="block1">
            Id: <input name="id">
        </p>
        <p class="block2">
            Name: <input name="name">
        </p>

        <p class="block3">
            Article: <input name="article">
        </p>
        <p class="block5">
            Picture: <input name="picture" type="file" class="block6">
        </p>
        <p class="block3">
            Catalog: <input name="catalog">
        </p>
        <p class="block3">
            Price: <input name="price">
        </p>
        <input type="submit" value="Save">
    </fieldset>
</form>
</body>
</html>
