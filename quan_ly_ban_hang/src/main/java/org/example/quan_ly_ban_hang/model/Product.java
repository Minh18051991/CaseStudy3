package org.example.quan_ly_ban_hang.model;

public class Product {
    private int id;
    private int idCategory;
    private String nameProduct;
    private String description;
    private double price;
    private String imageUrl;
    private boolean isDelete;

    public Product(int idCategory, String nameProduct, String description, double price, String imageUrl, boolean isDelete) {
        this.idCategory = idCategory;
        this.nameProduct = nameProduct;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.isDelete = isDelete;
    }
    public Product(int id, int idCategory, String nameProduct, String description, double price, String imageUrl, boolean isDelete) {
        this.id = id;
        this.idCategory = idCategory;
        this.nameProduct = nameProduct;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.isDelete = isDelete;
    }
    public Product() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
