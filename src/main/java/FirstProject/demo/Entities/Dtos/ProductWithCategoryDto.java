package FirstProject.demo.Entities.Dtos;

public class ProductWithCategoryDto {
    private int id;
    private String productName;
    private double unitPrice;
    private String categoryName;
    private String description;

    public ProductWithCategoryDto(int id, String productName, double unitPrice, String categoryName, String description) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.categoryName = categoryName;
        this.description = description;
    }

    public ProductWithCategoryDto(){}

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
