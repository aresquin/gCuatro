<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
    function Eliminar() {
        if (confirm("¿Está seguro de eliminar registro?")) {
            return true;
        }
        return false;
    }
    function fSoloNumeros(evt) {
            var charcode = (evt.which) ? evt.which : event.keyCode
         
            if ((charcode < 48 || charcode > 57) && charcode != 46) {
               return false;
           }
           return true;
        }
</script>


<div class="container">
    <div style="width: 100%; text-align: center;">
           <span class="Subtitulo" >Listado de Plan de Negocio </span>
    </div >
    <br />
    <div >
            <form:form action="buscar" method="post" commandName="criterioBusqueda">
            <table class="style1" cellpadding="0" cellspacing="0" >
            <tr>
                <td style="width: 112px;">
                    Titulo:
                </td>
                <td colspan="5" class="style7">
                        <form:input path="cPlaTitulo"  maxlength="80" cssStyle="width:600px" ></form:input>
                </td>    
            </tr>
            <tr>
                <td style="width: 112px">
                    <span  class="Label" >Categoria:</span>   
                </td>
                <td style=" width: 236px">
                    <form:select path="nCatID">
                        <form:option value="-1" >:::Seleccionar:::</form:option>
                        <c:forEach var="categorias" items="${categorias}">
                            <form:option value="${categorias.nCatID}" >${categorias.cCatNombre}</form:option>
                        </c:forEach>    
                    </form:select>
                    <form:errors path="nCatID" cssstyle="color:red"></form:errors>
                </td>
                <td style="width: 64px;">&nbsp;</td>
                    <td style="width: 102px;">
                    <span class="Label" >Estado:</span>
                </td>
                <td style="width: 238px;">
                    <form:select path="nEstID">
                        <form:option value="-1" >:::Seleccionar:::</form:option>
                        <form:option value="1" >Registrado</form:option>
                        <form:option value="2" >Aprobador</form:option>
                        <form:option value="3" >Rechazado</form:option>
                    </form:select>
                    <form:errors path="nEstID" cssstyle="color:red"></form:errors>
                </td>
            </tr>
            <tr>
                <td >
                    <span  class="Label" >Precio de Venta:</span>   
                </td>
                <td >
                    <input id="txtPreIni" type="text" size="20px" style="width:86px;" onkeypress="return fSoloNumeros(event);"  />&nbsp;&nbsp;
                    <input id="txtPreFin" type="text"  style="width:86px;"  onkeypress="return fSoloNumeros(event);" />
                </td>
                <td >&nbsp;</td>
                    <td >
                    <span class="Label" >Inversion Total:</span>
                </td>
                <td >
                    <input id="txtInvIni" type="text"  style="width:86px;"  onkeypress="return fSoloNumeros(event);" />&nbsp;&nbsp;
                    <input id="txtInvFin" type="text"  style="width:86px;"  onkeypress="return fSoloNumeros(event);" />
                </td>

            </tr>
           
            </table >
            <div style="display: inline; text-align: right; width: 50%" ><input type="submit" value="Buscar" class="btn btn-primary"/>
            </form:form>
            <div style="display: inline; text-align: left; width: 50%" ><a href="<c:url value='/pages/plan/nuevo'/>" class="btn btn-primary">Nuevo</a>        
    </div >
    <table class="style1" cellpadding="0" cellspacing="0" >
      
        <tr>
            <td class="style11">
                &nbsp;</td>
            <td class="style6" style="text-align:center; ">
                 <table border="1" width="98%"   >
                    <tr class="CabeceraListado" >
                        <td><span>Id</span></td>
                        <td><span>Titulo</span></td>
                        <td><span>Categoria</span></td>
                        <td><span>Inversion</span></td>
                        <td><span>Precio de Venta</span></td>
                        <td><span>Estado</span></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <% int fila=0; %>
                    <c:forEach var="Listado" items="${ListadoPlanes}">
                       
                    <% fila=fila+1; %>
                    <tr >
                        
                        <td><%=fila%></td>
                        <td>${Listado.cPlaTitulo}</td>
                        <td>${Listado.cCatNombre}</td>
                        <td>${Listado.nPlaInvTotal}</td>
                        <td>${Listado.nPlaPreVenta}</td>
                        <td>${Listado.cEstNombre}</td>
                        <td><a href="<c:url value='/pages/plan/editar?id=${Listado.nPlaID}'/>"><img alt="Editar" src="<c:url value='/image/bt_edit.gif' />" /></a></td>
                        <td><a href="<c:url value='/pages/plan/eliminar?id=${Listado.nPlaID}'/>" onclick="if (Eliminar()) { return true; } else { return false; }"><img alt="Editar" src="<c:url value='/image/bt_Delete.gif' />" /></a></td>
                        <td><a href="<c:url value='/pages/plan/CargarArchivo?id=${Listado.nPlaID}'/>"><img alt="Cargar" src="<c:url value='/image/file_upload.png' />" width="16" width="16" /></a></td>
                    </tr>
                    </c:forEach>    
                </table>  
            </td>    
                
        </tr>
</table>
<br/>  
<br/>  
</div>