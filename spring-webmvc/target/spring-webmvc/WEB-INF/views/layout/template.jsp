<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value='/stylesheets/bootstrap.min.css'/>"/>
        <link rel="stylesheet" type="text/css" href="<c:url value='/stylesheets/style.css'/>"/>        
        <title>Canchas Online</title>
            <style type="text/css">        
                .BorderCat
                {
                    border-style: solid;
                    border-width: 1px;
                }
            </style>

    </head>
    <body>
        <div>
            <tiles:insertAttribute name="header" />
        </div>
        <div>
            <div class="container">
                <table border="2" style="width: 100%; " >
                    <tr>
                        <td style="width: 200px; text-align: left; vertical-align: top; ">
                            <div style="display: inline;">
                            <tiles:insertAttribute name="DivIzquierdo" />
                            </div>
                        </td>
                        <td >
                            <div style="overflow: auto;">
                            <tiles:insertAttribute name="body" />
                            </div>
                        </td>
                    </tr>    
                </table>
            </div>
        </div>
        <div>
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>