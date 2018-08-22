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

@WebServlet("/addproduct")
public class DbController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("name");
        String article = req.getParameter("article");
        String picture = "images/"+req.getParameter("picture");
        String catalog = req.getParameter("catalog");
        System.out.println(name+" "+article);
        int price = Integer.valueOf(req.getParameter("price"));



        Product product = new Product(name,article,picture,catalog,price);
        System.out.println(product);
        Dao dao =new DaoimplMySql();

        try {
            dao.insert(product);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        resp.getWriter().print("Добавлена позиция: " +product.getArticle());
        req.setAttribute("product", product);
        req.setAttribute("pictire",product.getPicture());


        getServletContext().getRequestDispatcher("/addproduct.jsp").forward(req,resp);


    }
}
