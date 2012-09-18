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
    </head>
    <body>
        <div>
            <tiles:insertAttribute name="header" />
        </div>
        <div>
            <tiles:insertAttribute name="body" />
        </div>
        <div>
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>