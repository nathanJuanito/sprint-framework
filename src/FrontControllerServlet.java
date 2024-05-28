package mg.itu.prom16.controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FrontControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
    public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String url=req.getRequestURI();
        PrintWriter out=resp.getWriter();
        out.println(url);
    }
}