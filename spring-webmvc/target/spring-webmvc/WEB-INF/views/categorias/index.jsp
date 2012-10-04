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
    <div style="float:right;margin-top:10px;">
        <a href="<c:url value='/pages/categorias/new'/>" class="btn btn-primary">Agregar Categoria</a>
    </div>
    <div class="clear"></div>
    <div class="buscar-form">
        <form:form action="buscarPorNombre" method="post" commandName="criterioBusqueda">
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td><label>Buscar:</label></td>
                    <td>
                        <form:input path="cCatNombre" size="15"></form:input>
                    </td>
                    <td>
                        <input type="submit" value="Buscar" class="btn btn-primary"/>
                    </td>
                </tr>
            </table>
        </form:form>
    <br/>
    </div>
    <table class="table table-striped">
        <c:forEach var="Categoria" items="${Categoria}">
            <tr>
                <td>
                    <img alt="${Categoria.cCatNombre}" src="${Categoria.sCatRutaImagen}" />
                </td>
                <td>${Categoria.cCatNombre}</td>
                <td>
                    <a href="<c:url value='/pages/categorias/edit?id=${Categoria.nCatID}'/>">Editar categoria</a>
                    <a href="<c:url value='/pages/categorias/delete?id=${Categoria.nCatID}'/>" onclick="if (eliminaCategoria()) { return true; } else { return false; }">Eliminar categoria</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>