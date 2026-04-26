package tr.com.huseyinaydin.business.rules;

public class TestimonialBusinessRules {
    public static void checkIfCommentIsEmpty(String comment) {
        if (comment == null || comment.isEmpty()) {
            throw new RuntimeException("Yorum alanı boş olamaz.");
        }
    }
}
