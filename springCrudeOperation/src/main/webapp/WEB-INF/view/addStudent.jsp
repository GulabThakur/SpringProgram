<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring MVC Form Handling</title>
 </head>
 <body>
  <h2>Add Employee Data</h2>
  <form:form method="POST" action="/sdnext/save.html">
      <table>
       <tr>
           <td><form:label path="id">Employee ID:</form:label></td>
           <td><form:input path="id" value="${employee.id}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Employee Name:</form:label></td>
           <td><form:input path="name" value="${studentclass.name}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">Employee Age:</form:label></td>
           <td><form:input path="age" value="${studentclass.age}"/></td>
       </tr>
       <tr>
           <td><form:label path="salary">Employee Salary:</form:label></td>
           <td><form:input path="salary" value="${studentclass.salary}"/></td>
       </tr>
       
      
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
  <c:if test="${!empty studentclass}">
  <h2>List Employees</h2>
 <table align="left" border="1">
  <tr>
   <th>Employee ID</th>
   <th>Employee Name</th>
   <th>Employee Age</th>
   <th>Employee Salary</th>
  
           <th>Actions on Row</th>
  </tr>

  <c:forEach items="${employees}" var="employee">
   <tr>
    <td><c:out value="${studentclass.id}"/></td>
    <td><c:out value="${studentclass.name}"/></td>
    <td><c:out value="${studentclass.age}"/></td>
    <td><c:out value="${studentclass.salary}"/></td>
    
    <td align="center"><a href="edit.html?id=${studentclass.id}">Edit</a> | <a href="delete.html?id=${studentclass.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>
