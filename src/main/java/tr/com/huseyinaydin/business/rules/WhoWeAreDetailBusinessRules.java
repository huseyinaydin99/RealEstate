package tr.com.huseyinaydin.business.rules;

public class WhoWeAreDetailBusinessRules {
    public static void checkIfDescriptionIsEmpty(String description) {
        if (description == null || description.isEmpty()) {
            throw new RuntimeException("Açıklama alanı boş olamaz.");
        }
    }
}
