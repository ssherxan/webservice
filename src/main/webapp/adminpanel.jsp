<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <title>AdminPanel</title>
    <link rel="stylesheet" type="text/css" href="css/style_index.css">
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
    <span class="main_name">
        <a href="index.html"/> BRIGADIRR
    </span>
    <div class="menu" onclick="javascript:showElement('v-menu')">
        <img src="images/menu.png" class="png_menu">
        <a href="autorization.html" id="v-menu" class="v-menu">Вход</a>
    </div>
</header>

<form method="post" action="view">
    <p><select size="3" name="message">
        <option disabled>Выберите раздел каталога</option>
        <option value="Унитазы">Унитазы</option>
        <option value="Раковины">Раковины</option>
        <option value="Душевые кабины">Душевые кабины</option>
        <option value="Ванны">Ванны</option>
        <option value="Очистить">Очистить</option>
    </select></p>
    <p><input type="submit" value="Отправить"></p>
</form>
<a href="javascript:doPopup('panel.html');">Добавить в каталог</a>

<script language="javascript">
    function doPopup(popupPath) {
        window.open(popupPath, 'name',
            'width=550,height=550,scrollbars=NO,left=350,top=100');
    }
</script>

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
            <table>
                <tr>
                    <td>
                        <form>
                            <input hidden name="action" value="edit"/>
                            <input type="submit" value=" Редактировать"/>
                        </form>
                    </td>
                    <td>
                        <form>
                            <input hidden name="action" value="delete"/>
                            <input type="submit" value="Удалить"/>
                        </form>
                       </td>
                </tr>
            </table>
            <br>
        </div>
    </div>
    </c:forEach>
</body>

