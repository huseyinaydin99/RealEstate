package tr.com.huseyinaydin.validation;

import tr.com.huseyinaydin.dto.category.CreateCategoryDto;
import tr.com.huseyinaydin.dto.category.UpdateCategoryDto;

public class CategoryValidator {
    public static void validateCreate(CreateCategoryDto dto) {
        if (dto.getCategoryName() == null || dto.getCategoryName().trim().isEmpty()) {
            throw new RuntimeException("Kategori adı boş geçilemez.");
        }
        if (dto.getCategoryName().length() < 3) {
            throw new RuntimeException("Kategori adı en az 3 karakter olmalıdır.");
        }
    }

    public static void validateUpdate(UpdateCategoryDto dto) {
        if (dto.getCategoryID() <= 0) {
            throw new RuntimeException("Geçersiz kategori ID.");
        }
        if (dto.getCategoryName() == null || dto.getCategoryName().trim().isEmpty()) {
            throw new RuntimeException("Kategori adı boş geçilemez.");
        }
        if (dto.getCategoryName().length() < 3) {
            throw new RuntimeException("Kategori adı en az 3 karakter olmalıdır.");
        }
    }
}
