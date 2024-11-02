package org.example.quan_ly_ban_hang.repository.order;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.example.quan_ly_ban_hang.model.Order;
import org.example.quan_ly_ban_hang.repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRepository implements IOrderRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL_ORDER = "SELECT * FROM don_hang";

    public  OrderRepository() {}

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
        List<Order> orders = new ArrayList<>()  ;
        try (Connection connection = baseRepository.getConnectDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ORDER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int accountId = resultSet.getInt("tai_khoan_id");
                Date orderDate = resultSet.getDate("ngay_dat_hang");
                boolean status = resultSet.getBoolean("trang_thai");
                boolean isDelete = resultSet.getBoolean("xoa");
                Order order = new Order(id, accountId, orderDate, status, isDelete);
                orders.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }
}
