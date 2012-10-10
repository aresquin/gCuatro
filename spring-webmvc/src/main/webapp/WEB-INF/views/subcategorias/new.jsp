<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="container">
    <h1>Nueva Subcategoria</h1><br/>
    <form:form action="new" method="post" commandName="subcategoria" cssClass="form-horizontal">
        <div class="row">
            <div class="control-group">
                <label>Nombre:</label>
                <div class="controls">
                    <form:input path="cSCatNombre"></form:input>
                    <form:errors path="cSCatNombre" cssstyle="color:red"></form:errors>
                    <form:hidden path="nCatID"></form:hidden>
                </div>
            </div>
                <div class="actions" style="margin-left: 160px;">
                    <input name="" value="Guardar" type="submit" class="btn btn-primary">
                    <a style="margin-left: 5px;" href="<c:url value='/pages/subcategorias/index?nCatID=${subcategoria.nCatID}'/>">Cancelar</a>
                </div>
        </div>
    </form:form>
</div>

