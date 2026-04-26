package tr.com.huseyinaydin.business.rules;

public class ProductBusinessRules {
    public static void checkIfProductTitleIsNull(String title) {
        if (title == null || title.isEmpty()) {
            throw new RuntimeException("İlan başlığı boş olamaz.");
        }
    }

    public static void checkIfProductPriceIsNegative(java.math.BigDecimal price) {
        if (price != null && price.compareTo(java.math.BigDecimal.ZERO) < 0) {
            throw new RuntimeException("İlan fiyatı negatif olamaz.");
        }
    }
}
