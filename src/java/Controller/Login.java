
/*
/ * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

///**
// *
// * @author hp
// */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String username, password;
        username = req.getParameter("username");
        password = req.getParameter("password");
        if(username.equals("admin") && password.equals("admin"))
        {
            resp.sendRedirect("home.jsp");
        }
        else
        {
            resp.sendRedirect("index.jsp?info=Username or Password Wrong");
        }
        
    }
}
