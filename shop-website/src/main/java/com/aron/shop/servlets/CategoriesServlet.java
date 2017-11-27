package com.aron.shop.servlets;

import com.aron.shop.dao.CategoriesDAO;
import com.aron.shop.model.Categories;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aron.gherasim on 10/13/2017.
 */
@WebServlet(name = "CategoriesServlet", urlPatterns = ("/findCategories"))
public class CategoriesServlet extends HttpServlet {

    @Inject
    private CategoriesDAO categoriesDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String number = request.getParameter("myNumber");
        Categories cat = categoriesDAO.findOne(Integer.parseInt(number));

        out.write("Categories: " + cat.toString());
    }
}
