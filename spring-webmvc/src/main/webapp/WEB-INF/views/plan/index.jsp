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
    <table class="style1" cellpadding="0" cellspacing="0" >
         <tr>
            <td style="text-align:center;height: 50px;width: 56px; "    >
                 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;</td>
            <td style="text-align:center; height:50px; "    >
                 <span class="Titulo" >Listado de Plan de Negocio </span>
            </td>
        </tr>
        <tr>
            <td style="text-align:center; "    >
                 &nbsp;</td>
            <td style="text-align:left ; height:50px; "    >
                 <fieldset >
                     <legend><span class="Label" >Filtros de Búsqueda</span></legend>
                      <table class="style1" cellpadding="0" cellspacing="0" >
                        <tr>
                            <td style="width: 112px;">
                               <span class="Label" >Titulo:</span>
                            </td>
                            <td colspan="5" class="style7">
                                <input id="txtTitulo" type="text" style="width:95%;"  /></td>    
                        </tr>
                        <tr>
                            <td style="width: 112px">
                                <span  class="Label" >Categoria:</span>   
                            </td>
                            <td style=" width: 236px">
                                <select id="cmbCategoria">
                                    <option>:::Todas:::</option>
                                    <option>Categoria1</option>
                                    <option>Categoria2</option>
                                    <option>Categoria3</option>
                                    <option>Categoria4</option>
                                    <option>Categoria5</option>
                                    <option>Categoria6</option>
                                </select>
                            </td>
                            <td style="width: 64px;">&nbsp;</td>
                             <td style="width: 102px;">
                                <span class="Label" >Estado:</span>
                            </td>
                            <td style="width: 238px;">
                                <select id="cmbEstado">
                                   
                                    <option>Pendiente</option>
                                    <option>Activo</option>
                                    <option>Rechazado</option>
                                </select>
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
                 </fieldset >
            </td>
        </tr>
      
        <tr>
            <td class="style11">
                &nbsp;</td>
            <td class="style6" style="text-align:center; ">
                <input id="btnbuscar" type="button" value="Buscar"  />&nbsp;
                <input id="btnNuevo" type="button" value="Nuevo" onClick="javascript:Nuevo();"/></td>
        </tr>
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
                    </tr>
                    <% int fila=0; %>
                    <c:forEach var="Listado" items="${ListadoPlanes}">
                       
                    <% fila=fila+1; %>
                    <tr >
                        
                        <td><%=fila%></td>
                        <td>${Listado.cPlaTitulo}</td>
                        <td>${Listado.nCatID}</td>
                        <td>${Listado.nPlaInvTotal}</td>
                        <td>${Listado.nPlaPreVenta}</td>
                        <td>${Listado.nEstID}</td>
                        <td><a href="<c:url value='/pages/plan/editar?id=${Listado.nPlaID}'/>"><img alt="Editar" src="<c:url value='/image/bt_edit.gif' />" /></a></td>
                        <td><a href="<c:url value='/pages/plan/eliminar?id=${Listado.nPlaID}'/>" onclick="if (Eliminar()) { return true; } else { return false; }"><img alt="Editar" src="<c:url value='/image/bt_Delete.gif' />" /></a></td>
                    </tr>
                    </c:forEach>    
                </table>  
            </td>    
                
        </tr>
</table>
<br/>  
<br/>  
</div>