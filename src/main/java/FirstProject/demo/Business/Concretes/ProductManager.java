package FirstProject.demo.Business.Concretes;

import FirstProject.demo.Business.Abstracts.ProductService;
import FirstProject.demo.DataAcees.Abstracts.ProductRepository;
import FirstProject.demo.Entities.Dtos.ProductDto;
import FirstProject.demo.Entities.Dtos.ProductWithCategoryDto;
import FirstProject.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductManager implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getById(int productId) {
        Optional<Product> product = this.productRepository.findById(productId);
        return product.get();
    }

    @Override
    public void addProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        Product product = this.getById(productId);
        this.productRepository.delete(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product findProduct = this.getById(product.getId());
        findProduct.setProductName(product.getProductName());
        findProduct.setUnitPrice(product.getUnitPrice());
        findProduct.setUnitsInStock(product.getUnitsInStock());

        this.productRepository.save(findProduct);
    }

    @Override
    public List<Product> getByProductName(String productName) {
        return this.productRepository.getByProductName(productName);
    }

    @Override
    public List<ProductDto> getByCategory_Id(int categoryId) {
        return this.productRepository.getByCategory_Id(categoryId);
    }

    @Override
    public List<Product> getByProductNameStartsWith(String productName) {
        return this.productRepository.getByProductNameStartsWith(productName);
    }

    @Override
    public List<Product> getByProductNameOrCategory(String productName, int categoryId) {
        return this.productRepository.getByProductNameOrCategory_Id(productName, categoryId);
    }

    @Override
    public List<Product> getByCategory_CategoryName(String categoryName) {
        return this.productRepository.getByCategory_CategoryName(categoryName);
    }

    @Override
    public List<Product> getByNameAndCategory(String productName, double unitPrice) {
        return this.productRepository.getByNameAndCategory(productName, unitPrice);
    }

    @Override
    public List<Product> getByPriceAndCategory(double unitPrice, int categoryId) {
        return this.productRepository.getByPriceAndCategory(unitPrice, categoryId);
    }

    @Override
    public List<ProductWithCategoryDto> getProductsWithCategoryDetails() {
        return this.productRepository.getProductsWithCategoryDetails();
    }

    @Override
    public <T> List<T> findAll(int id, Class<T> type) {
        return this.productRepository.getById(id, type);
    }
}
