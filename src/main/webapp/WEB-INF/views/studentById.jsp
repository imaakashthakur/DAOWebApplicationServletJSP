<%-- 
    Document   : studentById
    Created on : 18-Feb-2021, 1:02:40 PM
    Author     : aakashthakur-work
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course"%>
<%@page import="com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student By Id</title>
    </head>
    <body>
        <h1>Displaying Student By ID Number</h1>
        <form method="post" action="HelloServlet"/>
        Enter the ID of Student: <input id = "studentId"/><br>

        <input type = "submit" />
        
        <%--
        <h1><center>Displaying Courses List</center></h1> 
        <table border ="1" width="500" align="center"> 
            <tr bgcolor="00FF7F"> 
                <th><b>Student ID</b></th> 
                <th><b>Student Name</b></th> 

               

                <%ArrayList<Course> std
                            = (ArrayList<Course>) request.getAttribute("coursesData");
                    for (Course s : std) {%> 
            <tr> 
                <td><%=s.getCourseId()%></td> 
                <td><%=s.getCourseName()%></td>  
            </tr> 
            <%}%> 
        </table> 
           --%>
        
        
        <table border ="1" width="500" align="center"> 
            <tr bgcolor="00FF7F"> 
                <th><b>Student ID</b></th> 
                <th><b>Student Name</b></th> 


                <%ArrayList<Student> std
                            = (ArrayList<Student>) request.getAttribute("studentData");
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
