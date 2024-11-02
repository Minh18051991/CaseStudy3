package org.example.quan_ly_ban_hang.service.order;

import org.example.quan_ly_ban_hang.model.Order;
import org.example.quan_ly_ban_hang.repository.order.IOrderRepository;
import org.example.quan_ly_ban_hang.repository.order.OrderRepository;

import java.util.List;

public class OrderService implements IOrderService  {
    IOrderRepository orderRepository =new OrderRepository();

    public OrderService() {}

    @Override
    public void add(Order order) {

    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll()  ;
    }
}
