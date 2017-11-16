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
      
            <h1>Edit Employee</h1>  
           <form:form method="POST" action="/SpringMVCCRUDSimple/editsave">    
            <table >    
            <tr>  
            <td></td>    
             <td><form:hidden  path="id" /></td>  
             </tr>   
             <tr>    
              <td>Name : </td>   
              <td><form:input path="name"  /></td>  
             </tr>    
             <tr>    
              <td>Salary :</td>    
              <td><form:input path="salary" /></td>  
             </tr>   
             <tr>    
              <td>Designation :</td>    
              <td><form:input path="designation" /></td>  
             </tr>   
               
             <tr>    
              <td> </td>    
              <td><input type="submit" value="Edit Save" /></td>    
             </tr>    
            </table>    
           </form:form>    
</body>
</html>