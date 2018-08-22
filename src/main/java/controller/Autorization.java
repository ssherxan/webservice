package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/admin")
public class Autorization extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url="/adminpanel.jsp";
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (login.equals("admin")&&password.equals("admin") ){
            getServletContext().getRequestDispatcher(url).forward(req,resp);
        }
        else {
            resp.setContentType("text/html, character=utf8");
            //resp.getWriter().print("неправильный догин или пароль");
            resp.getWriter().print("Enter correct login or password");
        }
    }
}
