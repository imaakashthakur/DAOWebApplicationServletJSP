<%-- 
    Document   : coursesData
    Created on : 18-Feb-2021, 12:05:43 PM
    Author     : aakashthakur-work
--%>
<%@page import="com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course"%> 
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courses</title>
    </head>
    <body>
        <h1><center>Displaying Courses List</center></h1> 
        <table border ="1" width="500" align="center"> 
            <tr bgcolor="00FF7F"> 
                <th><b>Courses ID</b></th> 
                <th><b>Courses Name</b></th> 

                <%--<h1>This is JSP!</h1>
            <%= request.getAttribute("name")%>
                --%>

                <%ArrayList<Course> std
                            = (ArrayList<Course>) request.getAttribute("coursesData");
                    for (Course s : std) {%> 
            <tr> 
                <td><%=s.getCourseId()%></td> 
                <td><%=s.getCourseName()%></td>  
            </tr> 
            <%}%> 
        </table> 
        <hr/> 
    </body>
</html>
