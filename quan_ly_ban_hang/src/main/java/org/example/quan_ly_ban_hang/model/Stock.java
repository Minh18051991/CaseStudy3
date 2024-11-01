package org.example.quan_ly_ban_hang.model;

import java.util.Date;

public class Stock {
    private int id;
    private int idProduct;
    private int quantity;
    private Date date;
    private boolean isDelete;
    public Stock(int id, int idProduct, int quantity, Date date, boolean isDelete) {
        this.id = id;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.date = date;
        this.isDelete = isDelete;
    }

    public Stock(int idProduct, int quantity, boolean isDelete) {
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.isDelete = isDelete;
    }
    public Stock(int idProduct, int quantity, Date date, boolean isDelete) {
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.date = date;
        this.isDelete = isDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
