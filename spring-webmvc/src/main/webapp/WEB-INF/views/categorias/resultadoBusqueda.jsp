<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<script type="text/javascript">
    function eliminaCategoria() {
        if (confirm("Desea eliminar esta categoria")) {
            return true;
        }
        return false;
    }
</script>

<div class="container">
    <h1 style="float:left">Administracion de Categorias</h1>
    <div style="float:right;margin-bottom:30px">
        <a href="<c:url value='/pages/categorias/new' />" class="btn btn-primary">Agregar nueva categoria</a>
    </div>
    <div class="clear"></div>
    <ul class="columnas">
        <c:forEach var="categoria" items="${categoria}">
            <li>
                <div class="card">
                    <div style="float:left">
                        <img src="<c:url value="${categoria.sCatRutaImagen}" />" alt="${categoria.cCatNombre}" width="90px"/><br/>
                        <td>${categoria.cCatNombre}<td/>
                    </div>
                    <div>
                        <a href="<c:url value='/pages/categorias/edit?nCatID=${categoria.nCatID}' />" >Editar</a><br/>
                        <a href="<c:url value='/pages/categorias/delete?nCatID=${categoria.nCatID}'/>" onclick="if (eliminaCategoria()) { return true; } else { return false; }">Eliminar</a>
                    </div>
                    <div class="clear"></div>
                </div>                    
            </li>
        </c:forEach>
    </ul>
</div>