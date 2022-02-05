package FirstProject.demo.Entities.Dtos;

public class ProductDto2 {
    private int id;
    private String productName;

    public ProductDto2(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }


    //public ProductDto2(){}

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
}
