package org.example.quan_ly_ban_hang.model;

import java.util.Date;

public class Order {
    private int id;
    private int idAccount;
    private Date date;
    private Boolean status;
    private Boolean isDelete;

    // Constructor
    public Order(int id, int idAccount, Date date, boolean status, boolean isDelete) {
        this.id = id;
        this.idAccount = idAccount;
        this.date = date;
        this.status = status;
        this.isDelete = isDelete;
    }

    public Order(int id, int idAccount, Date date, boolean status) {
        this.id = id;
        this.idAccount = idAccount;
        this.date = date;
        this.status = status;

    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}