package tr.com.huseyinaydin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.dto.productdetail.GetProductDetailByIdDto;
import tr.com.huseyinaydin.service.ProductDetailService;

@RestController
@RequestMapping("/api/ProductDetails")
@Tag(name = "ProductDetails", description = "Product Details API")
public class ProductDetailsController {
    private final ProductDetailService productDetailService;

    public ProductDetailsController(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetProductDetailByIdDto> getProductDetailByProductId(@PathVariable int id) {
        return ResponseEntity.ok(productDetailService.getProductDetailByProductId(id));
    }
}
