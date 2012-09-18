<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="navbar">      
    <div class="navbar-inner">
        <div class="container">
        <a href="javascript:void(0);" class="brand">Canchas Online</a>
        <ul class="nav">
            <li class=""><a href="<c:url value='/pages/usuarios/index'/>">Usuarios</a></li>
            <li class=""></li>
            <li class=""></li>
            <li class=""></li>
            <li class=""></li>
        </ul>
        <div class="right" style="color:white;line-height: 40px;">
            Bienvenido ${credential.correo} | <a href="<c:url value='/pages/usuarios/logout'/>">Salir</a>
        </div>
        </div>
    </div><!-- /topbar-inner -->
</div>