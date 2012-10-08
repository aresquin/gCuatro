<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="container">
        <form:form action="editar" method="post" commandName="Plan" cssClass="form-horizontal">
        <div class="row">
            
            <form:hidden path="nPlaID"></form:hidden>
            <table class="style1" cellpadding="0" cellspacing="0" >
                <tr>
                    <td class="style10" style="text-align:center; "    >
                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;</td>
                    <td class="style5" colspan="6" style="text-align:center; height:50px; "    >
                            <span class="Titulo" >Mantenimiento de Plan de Negocio </span>
                    </td>
                </tr>
                <tr>
                    <td class="style11">
                        &nbsp;</td>
                    <td class="style8">
                        <span class="Label" >Titulo:</span>
                    </td>
                    <td colspan="5" class="style7">
                       <form:input path="cPlaTitulo"></form:input>
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span  class="Label" >Categoria:</span>   
                    </td>
                    <td class="style13">
                        <form:select path="nCatID">
                            <form:option value="1" >Categoria 1</form:option>
                            <form:option value="2" >Categoria 2</form:option>
                            <form:option value="3" >Categoria 3</form:option>
                            <form:option value="4" >Categoria 4</form:option>
                        </form:select>
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
                        <span class="Label" >Visión de Negocio:</span>   
                    </td>
                    <td colspan="5">
                        <form:input path="cPlaVision"></form:input>
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >Tiempo de Ejecución:</span></td>
                    <td class="style13">
                        <form:input path="cPlaTiempo"></form:input>
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        <span class="Label" >Inversion Total:</span></td>
                    <td class="style3">
                        <form:input path="nPlaInvTotal" onkeypress="return fSoloNumeros(event);"></form:input>
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
                        <form:input path="cPlaRazon"></form:input>
                    </td>
                </tr>
                <tr>
                    <td class="style12">
                        &nbsp;</td>
                    <td class="style14">
                        <span class="Label" >ROI:</span></td>
                    <td class="style13">
                        <input id="txtROI" type="text" />
                    </td>
                    <td>
                        &nbsp;</td>
                    <td class="style2">
                        <span class="Label" >Margen neto en el primer año:</span></td>
                    <td class="style3">
                        <form:input path="nPlaNeto" onkeypress="return fSoloNumeros(event);"></form:input>
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
                        <select id="cmbEstado">
                            <option>:::Seleccionar:::</option>
                            <option>Pendiente</option>
                            <option>Activo</option>
                            <option>Rechazado</option>
                        </select>
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
                    <td colspan="6">
                        <fieldset >
                                <legend>Datos de Venta</legend>
                                <table>
                                <tr>
                                    <td> <span class="Label" >Precio de Venta:</span></td>
                                    <td><form:input path="nPlaPreVenta" onkeypress="return fSoloNumeros(event);"></form:input></td>
                                    <td>&nbsp;</td>
                                </tr>  
                                <tr>
                                    <td colspan="2" >
                                        <input id="FileUploadArchivo" type="file" onclick="return FileUploadArchivo_onclick()" />
                                        <input id="btnAdjuntar" type="button" value="Adjuntar" />
                                    </td>
                                    <td>
                                        &nbsp;</td>
                                </tr>  
                                <tr>
                                    <td colspan="3">
                                        <table border="1" width="90%"   >
                                            <tr class="CabeceraListado" >
                                                <td><span>Item</span></td>
                                                <td><span>Archivo</span></td>
                                                <td><span>Extension</span></td>
                                                <td></td>
                                            </tr>
                                            <tr>
                                                <td><span>1</span></td>
                                                <td><span>Plan de Negocio</span></td>
                                                <td><span>doc</span></td>
                                                <td>
                                                    <img alt="Eliminar" src="images/bt_Delete.gif" /></td>
                                            </tr>
                                            <tr>
                                                <td><span>2</span></td>
                                                <td><span>Presentacion</span></td>
                                                <td><span>ppt</span></td>
                                                <td> <img alt="Eliminar" src="images/bt_Delete.gif" /></td>
                                            </tr>
                                            <tr>
                                                <td><span>3</span></td>
                                                <td><span>Balance de Caja</span></td>
                                                <td><span>xls</span></td>
                                                <td> <img alt="Eliminar" src="images/bt_Delete.gif" /></td>
                                            </tr>
                                        </table>   

                                    </td>
                                </tr>  
                                </table>      
                        </fieldset >   
                    </td>
                       
            </table>   
        </div>    
        <div class="actions" style="margin-left: 160px;">
            <input name="" value="Grabar" type="submit" class="btn btn-primary">
            <a style="margin-left: 5px;" href="<c:url value='/pages/plan/listado'/>">Cancelar</a>
        </div>
        </form:form>
</div>

