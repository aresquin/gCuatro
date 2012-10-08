<%-- 
    Document   : file
    Created on : 08/10/2012, 02:05:41 AM
    Author     : Johan
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript">
    function Eliminar() {
        if (confirm("¿Está seguro de eliminar registro?")) {
            return true;
        }
        return false;
    }

</script>
<div class="container">
    <div >
    <form:form action="CargarArchivo" method="post" commandName="fileupload">        
        <form:hidden path="nPlaID"></form:hidden>
        <form:input path="cAAdjNombre" size="100" type="file"  ></form:input>
        <br/>  
        <input id="btnAdjuntar" type="submit" value="Adjuntar"  class="btn btn-primary"/>
        <a href="<c:url value='/pages/plan/listado'/>" class="btn btn-primary">Cancelar</a>
    </form:form>
    <div>
    <br/>
    <table class="table table-striped">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Extension</th>
            <th>Fec. Reg</th>
            <th style="width: 150px;"></th>
            <th style="width: 150px;"></th>
        </tr>
        <c:forEach var="archivo" items="${listaArchivo}">
            <tr>
                <td>${archivo.nAAdjSecuencia}</td>
                <td>${archivo.cAAdjNombre}</td>
                <td>${archivo.cAAdjExtension}</td>
                <td>${archivo.cAAdjFecCrea}</td>
                <td><a href="<c:url value='/pages/usuarios/ver?id=${archivo.nAAdjID}'/>">Ver</a></td>
                <td><a href="<c:url value='/pages/usuarios/delete?id=${archivo.nAAdjID}'/>" onclick="if (deleteUsuario()) { return true; } else { return false; }">Eliminar usuario</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>  
    <br/>  
</div>
