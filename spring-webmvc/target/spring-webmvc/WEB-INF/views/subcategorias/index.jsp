<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<script type="text/javascript">
    function eliminaCategoria() {
        if (confirm("Desea eliminar esta subcategoria")) {
            return true;
        }
        return false;
    }
</script>
<div class="container">
    <h1 style="float:left">Administracion de Subcategorias</h1>
    <div style="float:right;margin-bottom:10px">
        <a href="<c:url value='/pages/subcategorias/new' />" class="btn btn-primary">Agregar nueva subcategoria</a>
    </div>
    <div class="clear"></div>
    <table class="table table-striped">
        <tr>
            <th>Nombre</th>
            <th style="width: 150px;"></th>
        </tr>
        <c:forEach var="subcategoria" items="${subcategoria}">
            <tr>
                <td>${subcategoria.cSCatNombre}</td>
                <td><a href="<c:url value='/pages/subcategorias/edit?nSCatID=${subcategoria.nSCatID}'/>">Editar subcategoria</a></td>
                <td><a href="<c:url value='/pages/subcategorias/delete?nSCatID=${subcategoria.nSCatID}'/>" onclick="if (deleteSubcategoria()) { return true; } else { return false; }">Eliminar subcategoria</a></td>
            </tr>
        </c:forEach>
    </table>
</div>    