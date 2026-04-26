package tr.com.huseyinaydin.business.rules;

public class ToDoListBusinessRules {
    public static void checkIfContentIsNull(String content) {
        if (content == null || content.isEmpty()) {
            throw new RuntimeException("Yapılacak iş içeriği boş olamaz.");
        }
    }
}
