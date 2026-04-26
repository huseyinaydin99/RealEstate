package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.category.CreateCategoryDto;
import tr.com.huseyinaydin.dto.category.ResultCategoryDto;
import tr.com.huseyinaydin.dto.category.UpdateCategoryDto;
import tr.com.huseyinaydin.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/Categories")
@RequiredArgsConstructor
public class CategoriesController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<ResultCategoryDto>> categoryList() {
        return ResponseEntity.ok(categoryService.getAllCategory());
    }

    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CreateCategoryDto createCategoryDto) {
        categoryService.createCategory(createCategoryDto);
        return ResponseEntity.ok("Kategori başarıyla eklendi");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") int id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("Kategori başarıyla silindi");
    }

    @PutMapping
    public ResponseEntity<String> updateCategory(@RequestBody UpdateCategoryDto updateCategoryDto) {
        categoryService.updateCategory(updateCategoryDto);
        return ResponseEntity.ok("Kategori başarıyla güncellendi");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResultCategoryDto> getCategory(@PathVariable("id") int id) {
        return ResponseEntity.ok(categoryService.getCategory(id));
    }
}
