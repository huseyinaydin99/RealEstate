package tr.com.huseyinaydin.business.rules;

public class ServiceBusinessRules {
    public static void checkIfServiceNameIsNull(String serviceName) {
        if (serviceName == null || serviceName.isEmpty()) {
            throw new RuntimeException("Hizmet adı boş olamaz.");
        }
    }
}
