package tr.com.huseyinaydin.business.rules;

public class ContactBusinessRules {
    public static void checkIfMessageIsNull(String message) {
        if (message == null || message.isEmpty()) {
            throw new RuntimeException("Mesaj alanı boş olamaz.");
        }
    }
}
