package FirstProject.demo.Entities.Dtos;

import FirstProject.demo.Entities.Category;

public class ProductDto {
    private int id;
    private String productName;
    private double unitPrice;
    private Category category;

    public ProductDto(int id, String productName, double unitPrice, Category category) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.category = category;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
