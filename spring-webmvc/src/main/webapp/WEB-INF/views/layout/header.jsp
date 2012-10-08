<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="navbar">     
      <style type="text/css">
        .style1
        {
            width: 100%;
           
        }
      
        .style2
        {
        }
        .style4
        {
            width: 314px;
        }
        .BorderCat
        {
            border-style: solid;
            border-width: 1px;
        }
    </style>
    <div >
        <div class="container">
            <table  style="text-align:left; width:100%;  " class="style1" border="0" >
                <tr>
                    <td  align="left"  >
                    <span>Bienvenido ${credential.correo} </span>              
                    </td>
                    <td  align="right"  >                   
                        <a href="<c:url value='/pages/usuarios/index'/>">Página Principal</a> | 
                        <a href="<c:url value='/pages/usuarios/index'/>">Mi Cuenta</a> | 
                        <a href="<c:url value='/pages/usuarios/index'/>">Mi Carrito</a> | 
                        <a href="<c:url value='/pages/usuarios/index'/>">Mapa del Sitio</a>
                        | <a href="<c:url value='/pages/usuarios/logout'/>">Salir</a>

                    </td>
                </tr>
                <tr>
                    <td class="style4">
                        <img alt="" src="<c:url value='/image/imported/logo.jpg'/>"  /></td>
                    <td style="text-align:center"  >
                    <br /><br /> 
                    <span style="font-size: 45px; font-family: Arial; font-weight:bold;   text-align:center; "><i>PLANES EMPRESARIALES</i> </span><br />
                    <br />
                    <br />
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="txtBuscar" type="text" size="700px" style="width:80%;"   /><input id="btnBuscar" type="button" value="Buscar" /> 
                    </td>
                </tr>
            </table>
            
        </div>
    </div><!-- /topbar-inner -->
</div>