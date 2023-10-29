package Servlet;

import com.example.testmvc.ClassRoom;
import com.example.testmvc.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.*;

@WebServlet(name = "SitSpaceManagementServlet", value = "/AddStudent")
public class SitSpaceManagementServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String scoreString = request.getParameter("score");

        int score = Integer.parseInt(scoreString);
        Student student = new Student(id, name, score);
        ClassRoom.getInstance().addStudent(student);
        response.sendRedirect(request.getContextPath()+"/alldata.jsp");

    }
}
 
