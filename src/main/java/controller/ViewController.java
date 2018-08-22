package controller;

import Entyti.Product;
import dao.Dao;
import dao.DaoimplMySql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/view")
public class ViewController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String catalog = req.getParameter("catalog");
        String message = req.getParameter("message");
        if (message != null) {
            catalog=message;
        }
        Dao dao = new DaoimplMySql();
        List<Product> list = dao.selectByCatalog(catalog);
        req.setAttribute("list", list);

        if (message!=null) {
            getServletContext().getRequestDispatcher("/adminpanel.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/select.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req, resp);
    }
}
