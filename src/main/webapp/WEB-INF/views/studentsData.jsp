<%-- 
    Document   : index
    Created on : 17-Feb-2021, 4:04:18 PM
    Author     : aakashthakur-work
--%>
<%@page import="com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Student"%> 
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students Database</title>
    </head>
    <body>
        <h1><center>Displaying Student List</center></h1> 
        <table border ="1" width="500" align="center"> 
            <tr bgcolor="00FF7F"> 
                <th><b>Student Name</b></th> 
                <th><b>Student Address</b></th> 
                <th><b>Student Contact No</b></th> 

                <%--<h1>This is JSP!</h1>
            <%= request.getAttribute("name")%>
                --%>

                <%ArrayList<Student> std
                            = (ArrayList<Student>) request.getAttribute("studentsData");
                    for (Student s : std) {%> 
            <tr> 
                <td><%=s.getName()%></td> 
                <td><%=s.getAddress()%></td> 
                <td><%=s.getContactNo()%></td> 
            </tr> 
            <%}%> 
        </table> 
        <hr/> 
        
    </body>
</html>
