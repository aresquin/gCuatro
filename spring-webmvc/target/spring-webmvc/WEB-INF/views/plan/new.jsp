<%-- 
    Document   : new
    Created on : 07/10/2012, 10:38:14 PM
    Author     : Johan
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="container">
    <br />
        <form:form action="nuevo" method="post" commandName="Plan" cssClass="form-horizontal">
        <div class="row">
            <form:hidden path="nUsuCrea"></form:hidden>
            <table  >
                <tr>
                    <td   style="text-align:center; "    >
                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;</td>
                    <td colspan="6" style="text-align:center; height:50px; "    >
                            <span class="Subtitulo" >Mantenimiento de Plan de Negocio </span>
                    </td>
                </tr>
                <tr>
                    <td >
                        &nbsp;</td>
                    <td >
                        <span class="Label" >Titulo:</span>
                    </td>
                    <td colspan="5" class="style7">
                       <form:input path="cPlaTitulo"  maxlength="80" cssStyle="width:600px" ></form:input>
                        <form:errors path="cPlaTitulo" cssstyle="color:red"></form:errors>
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Categoria:</span>   
                    </td>
                    <td class="style13">
                        <form:select path="nCatID">
                            <form:option value="-1" >:::Seleccionar:::</form:option>
                            <c:forEach var="categorias" items="${categorias}">
                                <form:option value="${categorias.nCatID}" >${categorias.cCatNombre}</form:option>
                            </c:forEach>    
                        </form:select>
                        <form:errors path="nCatID" cssstyle="color:red"></form:errors>
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        &nbsp;</td>
                    <td class="style3">
                        &nbsp;</td>
                    <td>
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Visi�n de Negocio:</span>   
                    </td>
                    <td colspan="5">
                        <form:textarea path="cPlaVision"  maxlength="80" cssStyle="width:600px;" ></form:textarea>
                        <form:errors path="cPlaVision" cssstyle="color:red"></form:errors>
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Tiempo de Ejecuci�n:</span></td>
                    <td class="style13">
                        <form:input path="cPlaTiempo"></form:input>
                        <form:errors path="cPlaTiempo" cssstyle="color:red"></form:errors>
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        <span class="Label" >Inversion Total:</span></td>
                    <td class="style3">
                        <form:input path="nPlaInvTotal" onkeypress="return fSoloNumeros(event);"></form:input>
                        <form:errors path="nPlaInvTotal" cssstyle="color:red"></form:errors>
                    </td>
                    <td>
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Razonamiento de Negocio:</span></td>
                    <td colspan="5">
                        <form:textarea path="cPlaRazon"  maxlength="80" cssStyle="width:600px" ></form:textarea>
                        <form:errors path="cPlaRazon" cssstyle="color:red"></form:errors>                        
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >ROI:</span></td>
                    <td class="style13">
                        <form:input path="nPlaROI"></form:input>
                        <form:errors path="nPlaROI" cssstyle="color:red"></form:errors>  
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        <span class="Label" >Margen neto en el primer a�o:</span></td>
                    <td class="style3">
                        <form:input path="nPlaNeto" onkeypress="return fSoloNumeros(event);"></form:input>
                        <form:errors path="nPlaNeto" cssstyle="color:red"></form:errors>  
                    </td>
                    <td>
                        &nbsp;</td>
                </tr>
                 <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Precio de Venta</span></td>
                    <td class="style13">
                       <form:input path="nPlaPreVenta" onkeypress="return fSoloNumeros(event);"></form:input>
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                       &nbsp;</td>
                    <td class="style3">
                         &nbsp;
                    </td>
                    <td>
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Estado:</span>
                    </td>
                    <td class="style13">
                        <form:select path="nEstID">
                            <form:option value="1" >Registrado</form:option>
                            <form:option value="2" >Publicado</form:option>
                            <form:option value="3" >Rechazado</form:option>
                        </form:select>
                        <form:errors path="nEstID" cssstyle="color:red"></form:errors>  
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        &nbsp;</td>
                    <td class="style3">
                        &nbsp;</td>
                    <td>
                        &nbsp;</td>
                </tr>  
            </table>   
        </div>    
            <br />         
        <div class="actions" style="margin-left: 160px; alignment-baseline: central; ">
            <input name="" value="Grabar" type="submit" class="btn btn-primary">
            <a style="margin-left: 5px;" href="<c:url value='/pages/plan/listado'/>"  class="btn btn-primary" >Cancelar</a>
        </div>
        </form:form>
</div>

