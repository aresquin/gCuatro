<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="container">
    <h1>Editar categoria</h1><br/>
    <form:form action="edit" method="post" commandName="categoria" cssClass="form-horizontal">
        <div class="row">
            <form:hidden path="nCatID"></form:hidden>
            <div class="control-group">
                <label>Nombre:</label>
                <div class="controls">
                    <form:input path="cCatNombre"></form:input>
                    <form:errors path="cCatNombre" cssstyle="color:red"></form:errors>
                </div>
            </div>
                <div class="control-group">
                    <label>Ruta:</label>
                    <div class="controls">
                        <form:input path="sCatRutaImagen"></form:input>
                        <form:errors path="sCatRutaImagen" cssstyle="color:red"></form:errors>
                    </div>
                </div>
        </div>
                    <div class="actions" style="margin-left: 160px;">
                        <input name="" value="Guardar" type="submit" class="btn btn-primary">
                        <a style="margin-left: 5px;" href="<c:url value='/pages/categorias/index'/>">Cancelar</a>
                    </div>
    </form:form>
</div>