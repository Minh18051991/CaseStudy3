package org.example.quan_ly_ban_hang.model;

public class Permission {
    private int id;
    private int idRole;
    private int idAccount;

    public Permission(int id, int idRole, int idAccount) {
        this.id = id;
        this.idRole = idRole;
        this.idAccount = idAccount;
    }
    public Permission() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }
}
