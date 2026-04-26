package tr.com.huseyinaydin.business.rules;

public class AddressBusinessRules {
    public static void checkIfAddressIsNull(String address) {
        if (address == null || address.isEmpty()) {
            throw new RuntimeException("Adres alanı boş olamaz.");
        }
    }
}
