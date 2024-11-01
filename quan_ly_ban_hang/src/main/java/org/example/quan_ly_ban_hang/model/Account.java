package org.example.quan_ly_ban_hang.model;

import java.util.Date;

public class Account {
    private int id;
    private String idCustomer;
    private String userName;
    private String password;
    private Date date;
    private boolean isDelete;
    public Account(String idCustomer, String userName, String password, boolean isDelete) {
        this.idCustomer = idCustomer;
        this.userName = userName;
        this.password = password;
        this.isDelete = isDelete;
    }
   public Account(int id, String idCustomer, String userName, String password, Date date, boolean isDelete) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.userName = userName;
        this.password = password;
        this.date = date;
        this.isDelete = isDelete;

   }
   public Account(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdKhachHang() {
        return idCustomer;
    }

    public void setIdKhachHang(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

