package tr.com.huseyinaydin.validation;

import tr.com.huseyinaydin.dto.product.CreateProductDto;

import java.math.BigDecimal;

public class ProductValidator {
    public static void validateCreate(CreateProductDto dto) {
        if (dto.getTitle() == null || dto.getTitle().trim().isEmpty()) {
            throw new RuntimeException("İlan başlığı boş geçilemez.");
        }
        if (dto.getPrice() == null || dto.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Geçerli bir fiyat giriniz.");
        }
        if (dto.getCity() == null || dto.getCity().trim().isEmpty()) {
            throw new RuntimeException("Şehir alanı boş geçilemez.");
        }
        if (dto.getProductCategory() <= 0) {
            throw new RuntimeException("Lütfen bir kategori seçiniz.");
        }
    }
}
