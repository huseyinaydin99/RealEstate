package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.productimage.CreateProductImageDto;
import tr.com.huseyinaydin.dto.productimage.GetProductImageByProductIdDto;
import tr.com.huseyinaydin.dto.productimage.ResultProductImageDto;
import tr.com.huseyinaydin.service.ProductImageService;

import java.util.List;

@RestController
@RequestMapping("/api/ProductImages")
public class ProductImagesController {
    private final ProductImageService productImageService;

    public ProductImagesController(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<List<GetProductImageByProductIdDto>> getProductImageByProductId(@PathVariable int productId) {
        List<GetProductImageByProductIdDto> values = productImageService.getProductImageByProductId(productId);
        return ResponseEntity.ok(values);
    }

    @GetMapping
    public ResponseEntity<List<ResultProductImageDto>> getAllProductImages() {
        List<ResultProductImageDto> values = productImageService.getAllProductImages();
        return ResponseEntity.ok(values);
    }

    @PostMapping
    public ResponseEntity<String> createProductImage(@RequestBody CreateProductImageDto createProductImageDto) {
        productImageService.createProductImage(createProductImageDto);
        return ResponseEntity.ok("Ürün görseli başarılı bir şekilde eklendi.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductImage(@PathVariable int id) {
        productImageService.deleteProductImage(id);
        return ResponseEntity.ok("Ürün görseli başarılı bir şekilde silindi.");
    }

    @GetMapping("/GetImageUrl/{id}")
    public ResponseEntity<String> getImageUrl(@PathVariable int id) {
        String imageUrl = productImageService.getImageUrl(id);
        return ResponseEntity.ok(imageUrl);
    }

    @GetMapping("/AppUser/{id}")
    public ResponseEntity<List<ResultProductImageDto>> getAllProductImagesByAppUserId(@PathVariable int id) {
        List<ResultProductImageDto> values = productImageService.getAllProductImagesByAppUserId(id);
        return ResponseEntity.ok(values);
    }
}
