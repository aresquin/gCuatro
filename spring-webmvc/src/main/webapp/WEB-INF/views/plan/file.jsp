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
    
    <br />
    <div style="width: 100%; text-align: center;">
           <span class="Subtitulo" >Archivos Adjuntos</span>
    </div >
    <br />
    <div class="clear"></div>
    
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
    <table class="table table-striped" style="width:850px; ">
        <tr>
            <th>ID</th>
            <th style="width: 450px;">Nombre</th>
           
            <th style="width: 250px;">Fec. Reg</th>
            <th style="width: 20px;"></th>
            <th style="width: 20px;"></th>
        </tr>
        <c:forEach var="archivo" items="${ListadoArchivos}">
            <tr>
                <td>${archivo.nAAdjSecuencia}</td>
                <td>${archivo.cAAdjNombre}</td>
                
                <td>${archivo.cAAdjFecCrea}</td>
                <td><a href="<c:url value='/pages/plan/ver?id=${archivo.nAAdjID}'/>"><img alt="Ver" src="<c:url value='/image/verdetalle.gif' />" /></a></td>
                <td><a href="<c:url value='/pages/plan/eliminarArchivo?nPlaID=${archivo.nPlaID}&id=${archivo.nAAdjID}'/>" onclick="if (Eliminar()) { return true; } else { return false; }"><img alt="Editar" src="<c:url value='/image/bt_Delete.gif' />" /></a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>  
    <br/>  
</div>
