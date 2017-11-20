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
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
      
            <h1>Ragistrasion Form</h1>  
           <form:form method="post" action="save">    
            <table >    
             <tr>    
              <td>Name : </td>   
              <td><form:input path="name" /></td>  
             </tr>    
             <tr>    
              <td>Number :</td>    
              <td><form:input path="number"  /></td>  
             </tr>   
             <tr>    
              <td>EmailId :</td>    
              <td><form:input path="userId" /></td>  
             </tr> 
              <tr>    
              <td>Password :</td>    
              <td><form:input path="password" /></td> 
             </tr>     
             <tr> 
               <tr>    
              <td>Re-Password :</td>    
              <td><form:input path="re_password" /></td>  
             </tr>     
             <tr>      
              <td> </td>    
              <td><input type="submit" value="Save" /></td>    
             </tr>    
            </table>    
           </form:form>    
</body>
</html>