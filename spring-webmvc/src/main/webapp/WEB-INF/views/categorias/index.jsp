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
    <div class="buscar-form">
        <form:form action="buscar" method="post" commandName="criterioBusqueda">
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td><label>Buscar:</label></td>
                    <td>
                        <form:input path="nombre" size="10"></form:input>
                    </td>
                    <td>
                        <input type="submit" value="Buscar" class="btn btn-primary"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </div>        
    <ul class="columnas">
        <c:forEach var="categoria" items="${categorias}">
            <li>
                <div class="card">
                    <div style="float:left">
                        <img src="<c:url value="${categoria.sCatRutaImagen}" />" alt="${categoria.cCatNombre}" width="90px"/><br/>
                        <td>${categoria.cCatNombre}<td/>
                    </div>
                    <div>
                        <a href="<c:url value='/pages/categorias/edit?id=${categoria.nCatID}' />" >Editar</a><br/>
                        <a href="<c:url value='/pages/categorias/delete?id=${categoria.nCatID}'/>" onclick="if (eliminaCategoria()) { return true; } else { return false; }">Eliminar</a>
                    </div>
                    <div class="clear"></div>
                </div>                    
            </li>
        </c:forEach>
    </ul>
</div>