package tr.com.huseyinaydin.business.rules;

import java.math.BigDecimal;

public class ProductBusinessRules {
    public static void checkIfProductPriceIsNegative(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Ürün fiyatı negatif olamaz.");
        }
    }
}
