package bkap.shopwatches.controller.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Rin-DTS
 */
@WebServlet("/products.html")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = null;
        String type = req.getParameter("type");
        if (type.equalsIgnoreCase("single")) {
            rd = req.getRequestDispatcher("/views/web/detail_product.jsp");
        } else
            rd = req.getRequestDispatcher("/views/web/products.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
