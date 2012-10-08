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
        <form:input path="cPlaTitulo" size="10" type="cAAdjNombre" ></form:input>
        <input id="btnAdjuntar" type="button" value="Adjuntar"  class="btn btn-primary"/>
        <a style="margin-left: 5px;"  class="btn btn-primary" href="<c:url value='/pages/plan/listado'/>">Cancelar</a>
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
        <c:forEach var="archivo" items="${usuarios}">
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
