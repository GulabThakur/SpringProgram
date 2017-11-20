<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
      
            <h1>Add New Employee</h1>  
           <form:form method="post" action="save">    
            <table >    
             <tr>    
              <td>FirstName : </td>   
              <td><form:input path="fName" type="test" /></td>  
             </tr>    
             <tr>    
              <td>LastName :</td>    
              <td><form:input path="lName" type="test"/></td>  
             </tr>   
             <tr>    
              <td>Email :</td>    
              <td><form:input path="Email" type="email"/></td>  
             </tr>  
              <tr>    
              <td>Password :</td>    
              <td><form:input  path="password" type="password"/></td>  
             </tr> 
              <tr>    
              <td>Conform :</td>    
              <td><form:input path="conformPassword" type="password" /></td>  
             </tr>
             <tr>    
              <td> </td>    
              <td><input type="submit" value="Save" /></td>    
             </tr>    
            </table>    
           </form:form>    
</body>
</html>