package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.product.CreateProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;
import tr.com.huseyinaydin.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ResultProductWithCategoryDto>> productListWithCategory() {
        return ResponseEntity.ok(productService.getAllProductWithCategory());
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody CreateProductDto createProductDto) {
        productService.createProduct(createProductDto);
        return ResponseEntity.ok("Ürün başarılı bir şekilde eklendi.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok("Ürün başarılı bir şekilde silindi.");
    }

    @GetMapping("/status-true/{id}")
    public ResponseEntity<Void> productStatusChangeToTrue(@PathVariable int id) {
        productService.productStatusChangeToTrue(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/status-false/{id}")
    public ResponseEntity<Void> productStatusChangeToFalse(@PathVariable int id) {
        productService.productStatusChangeToFalse(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/last5")
    public ResponseEntity<List<ResultProductWithCategoryDto>> last5ProductList() {
        return ResponseEntity.ok(productService.getLast5ProductAsync());
    }
}
