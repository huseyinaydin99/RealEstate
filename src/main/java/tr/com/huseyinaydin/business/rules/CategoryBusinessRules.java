package tr.com.huseyinaydin.business.rules;

public class CategoryBusinessRules {
    public static void checkIfCategoryNameIsNull(String categoryName) {
        if (categoryName == null || categoryName.isEmpty()) {
            throw new RuntimeException("Kategori adı boş olamaz.");
        }
    }
}
