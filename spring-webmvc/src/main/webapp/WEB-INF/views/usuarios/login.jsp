<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="navbar">      
    <div class="navbar-inner">
        <div class="container">
            <a href="javascript:void(0);" class="brand">Canchas Online</a>
        </div>
    </div><!-- /topbar-inner -->
</div>
<div class="container">
    <form:form action="autenticar" method="post" commandName="credential" cssClass="form-horizontal">
        <div class="row">
            <div class="control-group">
                <label>Correo electrónico:</label>
                <div class="controls">
                    <form:input path="correo"></form:input>
                    <form:errors path="correo" cssstyle="color:red"></form:errors>
                </div>
            </div>
            <div class="control-group">
                <label>Password:</label>
                <div class="controls">
                    <form:input path="password"></form:input>
                    <form:errors path="password" cssstyle="color:red"></form:errors>
                </div>
            </div>                
        </div>
        <div class="actions" style="margin-left: 160px;">
            <input name="" value="Save" type="submit" class="btn btn-primary">            
        </div>                
    </form:form>
</div>
