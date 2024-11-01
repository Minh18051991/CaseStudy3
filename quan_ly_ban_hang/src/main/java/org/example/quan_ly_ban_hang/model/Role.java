package org.example.quan_ly_ban_hang.model;

public class Role {
    private int id;
    private String name;

    public Role(int id, String nameRole) {
        this.id = id;
        this.name = nameRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
