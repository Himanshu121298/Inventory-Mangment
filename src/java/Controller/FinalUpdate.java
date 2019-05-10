/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Suppliers;
import Dao.SupplierOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class FinalUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") != null) {
            PrintWriter out = resp.getWriter();
            String name, username, password, address, account;
            name = req.getParameter("name");
            username = req.getParameter("username");
            password = req.getParameter("password");
            address = req.getParameter("address");
            account = req.getParameter("account");
            Suppliers st = new Suppliers(name, username, password, address, account);
            long id = Long.parseLong(req.getParameter("id"));
            SupplierOperation so = new SupplierOperation();
            long l = so.upDate(id, st);
            if (l > 0) {
                if(account.equals("Faculty"))
            {
               resp.sendRedirect("AdminPanel/FacultyInfo.jsp");
            }
            else{
               resp.sendRedirect("AdminPanel/UserInfo.jsp");
            }
            } 
        }
    }
}
