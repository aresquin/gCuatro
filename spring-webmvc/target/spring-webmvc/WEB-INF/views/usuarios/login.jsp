<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div  >      
    <div  >
        <div class="container" style="background-color:#00CC33; height: 40px; "s>
            <h1>&nbsp;Acceso al Sistema</h1>
        </div>
    </div><!-- /topbar-inner -->
</div>
<br />
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
