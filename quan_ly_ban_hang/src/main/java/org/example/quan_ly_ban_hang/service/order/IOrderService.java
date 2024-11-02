package org.example.quan_ly_ban_hang.service.order;

import org.example.quan_ly_ban_hang.model.Order;

import java.util.List;

public interface IOrderService {
    void  add(Order order);
    void delete(Order order);
    void update(Order order);
    Order findById(int id);
    List<Order> findAll();
}
