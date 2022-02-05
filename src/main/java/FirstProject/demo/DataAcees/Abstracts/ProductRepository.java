package FirstProject.demo.DataAcees.Abstracts;

import FirstProject.demo.Entities.Dtos.ProductDto;
import FirstProject.demo.Entities.Dtos.ProductWithCategoryDto;
import FirstProject.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> getByProductName(String productName);
    //List<Product> getByCategory_Id(int categoryId);
    List<Product> getByProductNameStartsWith(String productName);
    List<Product> getByProductNameOrCategory_Id(String productName, int categoryId);
    List<Product> getByCategory_CategoryName(String categoryName);

    //@Query("From Product where productName=:productName and category.id=:categoryId")
    //List<Product> getByNameAndCategory(String productName, int categoryId);

    @Query("From Product where productName=:productName and unitPrice=:unitPrice")
    List<Product> getByNameAndCategory(String productName, double unitPrice);


    @Query("From Product where unitPrice>=:unitPrice and category.id=:categoryId")
    List<Product> getByPriceAndCategory(double unitPrice, int categoryId);


    @Query("Select new FirstProject.demo.Entities.Dtos.ProductWithCategoryDto"
    +"(product.id, product.productName, product.unitPrice, category.categoryName, category.description)"
    +"From Category category inner join category.products product order by product.id desc")
    List<ProductWithCategoryDto> getProductsWithCategoryDetails();

    //Gösterim – Projections
    List<ProductDto> getByCategory_Id(int categoryId);
    <T> List<T> getById(int id, Class<T> type);
}
