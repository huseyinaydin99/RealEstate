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
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoriesController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<ResultCategoryDto>> categoryList() {
        List<ResultCategoryDto> values = categoryService.getAllCategory();
        return ResponseEntity.ok(values);
    }

    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CreateCategoryDto createCategoryDto) {
        categoryService.createCategory(createCategoryDto);
        return ResponseEntity.ok("Kategori başarılı bir şekilde eklendi.");
    }

    @DeleteMapping("/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable int categoryId) {
        categoryService.deleteCategory(categoryId);
        return ResponseEntity.ok("Kategori başarılı bir şekilde silindi.");
    }

    @PutMapping
    public ResponseEntity<String> updateCategory(@RequestBody UpdateCategoryDto updateCategoryDto) {
        categoryService.updateCategory(updateCategoryDto);
        return ResponseEntity.ok("Kategori başarılı bir şekilde güncellendi.");
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<ResultCategoryDto> getCategory(@PathVariable int categoryId) {
        ResultCategoryDto value = categoryService.getCategory(categoryId);
        return ResponseEntity.ok(value);
    }
}
