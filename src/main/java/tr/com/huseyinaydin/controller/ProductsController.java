package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;
import tr.com.huseyinaydin.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/Products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ResultProductDto>> productList() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("/ProductListWithCategory")
    public ResponseEntity<List<ResultProductWithCategoryDto>> productListWithCategory() {
        return ResponseEntity.ok(productService.getAllProductWithCategory());
    }

    @GetMapping("/ProductDealOfTheDayStatusChangeToTrue/{id}")
    public ResponseEntity<Void> productDealOfTheDayStatusChangeToTrue(@PathVariable int id) {
        productService.productDealOfTheDayStatusChangeToTrue(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ProductDealOfTheDayStatusChangeToFalse/{id}")
    public ResponseEntity<Void> productDealOfTheDayStatusChangeToFalse(@PathVariable int id) {
        productService.productDealOfTheDayStatusChangeToFalse(id);
        return ResponseEntity.ok().build();
    }
}
