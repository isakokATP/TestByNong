<%@ page import="java.util.List" %>
<%@ page import="com.example.testmvc.Student" %>
<%@ page import="com.example.testmvc.ClassRoom" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/29/2023
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllData</title>
</head>
<body>
    <h3>AllData</h3>
    <table>
        <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>score</td>
            <td>Grade</td>
        </tr>
        </thead>
        <tbody>

<%
    List<Student> students = ClassRoom.getInstance().getStudents();
    for (Student student : students) {
%>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getName() %></td>
        <td><%= student.getScore() %></td>
    </tr>
<%
    }
%>
        </tbody>
    </table>
</body>
</html>
