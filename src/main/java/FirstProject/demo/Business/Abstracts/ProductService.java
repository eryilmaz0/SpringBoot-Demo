package FirstProject.demo.Business.Abstracts;

import FirstProject.demo.Entities.Dtos.ProductDto;
import FirstProject.demo.Entities.Dtos.ProductWithCategoryDto;
import FirstProject.demo.Entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product getById(int productId);
    public void addProduct(Product product);
    public void deleteProduct(int productId);
    public void updateProduct(Product product);

    List<Product> getByProductName(String productName);
    List<ProductDto> getByCategory_Id(int categoryId);
    List<Product> getByProductNameStartsWith(String productName);
    List<Product> getByProductNameOrCategory(String productName, int categoryId);
    List<Product> getByCategory_CategoryName(String categoryName);
    List<Product> getByNameAndCategory(String productName, double unitPrice);
    List<Product> getByPriceAndCategory(double unitPrice, int categoryId);
    List<ProductWithCategoryDto> getProductsWithCategoryDetails();

    <T> List<T> findAll(int id, Class<T> type);
}
