package org.example.quan_ly_ban_hang.controller;

import org.example.quan_ly_ban_hang.model.Order;
import org.example.quan_ly_ban_hang.service.order.IOrderService;
import org.example.quan_ly_ban_hang.service.order.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "orderController" ,value = "/order")
public class OrderController extends HttpServlet {
    IOrderService orderService = new OrderService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                showListOrder(req, resp);
                break;
        }
    }

    private  void showListOrder(HttpServletRequest req, HttpServletResponse resp) {
        List<Order> listOrder = orderService.findAll();
        req.setAttribute("listOrder", listOrder);
        try {
            req.getRequestDispatcher("/views/order/list.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
