package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;
import tr.com.huseyinaydin.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ResultProductDto>> productList() {
        List<ResultProductDto> values = productService.getAllProductAsync();
        return ResponseEntity.ok(values);
    }

    @GetMapping("/ProductListWithCategory")
    public ResponseEntity<List<ResultProductWithCategoryDto>> productListWithCategory() {
        List<ResultProductWithCategoryDto> values = productService.getAllProductWithCategoryAsync();
        return ResponseEntity.ok(values);
    }

    @GetMapping("/ProductDealOfTheDayStatusChangeToFalse/{id}")
    public ResponseEntity<String> productDealOfTheDayStatusChangeToFalse(@PathVariable int id) {
        productService.productDealOfTheDayStatusChangeToFalse(id);
        return ResponseEntity.ok("Günün fırsatı durumu pasif yapıldı.");
    }

    @GetMapping("/ProductDealOfTheDayStatusChangeToTrue/{id}")
    public ResponseEntity<String> productDealOfTheDayStatusChangeToTrue(@PathVariable int id) {
        productService.productDealOfTheDayStatusChangeToTrue(id);
        return ResponseEntity.ok("Günün fırsatı durumu aktif yapıldı.");
    }

    @GetMapping("/GetProductByDealOfTheDayTrueWithCategory")
    public ResponseEntity<List<ResultProductWithCategoryDto>> getProductByDealOfTheDayTrueWithCategory() {
        List<ResultProductWithCategoryDto> values = productService.getProductByDealOfTheDayTrueWithCategoryAsync();
        return ResponseEntity.ok(values);
    }
}
