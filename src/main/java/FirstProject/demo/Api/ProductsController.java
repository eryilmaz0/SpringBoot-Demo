package FirstProject.demo.Api;
import FirstProject.demo.Business.Abstracts.ProductService;
import FirstProject.demo.Entities.Dtos.ProductDto;
import FirstProject.demo.Entities.Dtos.ProductDto2;
import FirstProject.demo.Entities.Dtos.ProductWithCategoryDto;
import FirstProject.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return this.productService.getAll();
    }


    @GetMapping("/get/{id}")
    public Product getById(@PathVariable int id){
        return this.productService.getById(id);
    }


    @PostMapping("")
    public void addProduct(@RequestBody Product product){
        this.productService.addProduct(product);
    }

    @PutMapping("")
    public void updateProduct(@RequestBody Product product){
        this.productService.updateProduct(product);
    }

    @DeleteMapping("")
    public void deleteProduct(@RequestParam int productId){
        this.productService.deleteProduct(productId);
    }

    @GetMapping("/getByProductName")
    public List<Product> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByCategoryId")
    public List<ProductDto> getByCategoryId(@RequestParam int categoryId){
        return this.productService.getByCategory_Id(categoryId);
    }

    @GetMapping("/getProductNameStartsWith")
    public List<Product> getProductNameStartsWith(@RequestParam  String productName){
        return this.productService.getByProductNameStartsWith(productName);
    }

    @GetMapping("/getByProductNameOrCategory")
    public List<Product> getByProductNameOrCategory(@RequestParam  int categoryId, @RequestParam  String productName){
        return this.productService.getByProductNameOrCategory(productName, categoryId);
    }

    @GetMapping("/getByCategoryName")
    public List<Product> getByCategoryName(String categoryName){
        return this.productService.getByCategory_CategoryName(categoryName);
    }

    @GetMapping("/getByCategoryAndPriceLimit")
    public List<Product> getByCategoryAndPriceLimit(@RequestParam String productName, @RequestParam double unitPrice){
        return this.productService.getByNameAndCategory(productName,unitPrice);
    }

    @GetMapping("/getByPriceAndCategory")
    public List<Product> getByPriceAndCategory(@RequestParam double unitPrice, @RequestParam int categoryId){
        return this.productService.getByPriceAndCategory(unitPrice, categoryId);
    }

    @GetMapping("/getProductsWithCategoryDetails")
    public List<ProductWithCategoryDto> getProductsWithCategoryDetails(){
        return this.productService.getProductsWithCategoryDetails();
    }


    @GetMapping("/getByProductId")
    public List<ProductDto> getByProductId(@RequestParam int id){
        return this.productService.findAll(id, ProductDto.class);
    }

    @GetMapping("/getByProductId2")
    public List<ProductDto2> getByProductId2(@RequestParam int id){
        return this.productService.findAll(id, ProductDto2.class);
    }

}
