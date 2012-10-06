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
    <h1 style="float:left">Administracion de categorias</h1>
    <div style="float:right;margin-bottom:10px;"></div>
    <div class="clear"></div>
        <c:forEach var="categoria" items="${categorias}">
            <div>
                <div style="float:left">
                    <img src="<c:url value="${categoria.sCatRutaImagen}" />" alt="${categoria.cCatNombre}" width="100px;"/>
                </div>
                <div>
                    <a href="<c:url value='/pages/categorias/edit?id=${categoria.nCatID}'/>">Editar categoria</a><br/>
                    <a href="<c:url value='/pages/categorias/delete?id=${categoria.nCatID}'/>" onclick="if (eliminaCategoria()) { return true; } else { return false; }">Eliminar categoria</a>
                </div>
                <div class="clear"></div>
            </div>
        </c:forEach>
</div>