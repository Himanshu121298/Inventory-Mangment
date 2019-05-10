/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Inventory;
import Dao.InventoryDeclaration;
import Dao.InventoryOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class InventoryController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String PName;
        String Brand;
        String Category;
        String Stock;
        String Price;
        PName = req.getParameter("PName");
        Brand = req.getParameter("Brand");
        Category = req.getParameter("Category");
        Stock = req.getParameter("Stock");
        Price = req.getParameter("Price");
        Inventory st = new Inventory(PName, Brand, Category, Stock, Price);
        InventoryDeclaration sd = new InventoryOperation();
        long id = sd.insert(st);
        if (id > 0) {
            resp.sendRedirect("home.jsp");
        }
    }
}
