package tr.com.huseyinaydin.business.rules;

public class PopularLocationBusinessRules {
    public static void checkIfCityNameIsNull(String cityName) {
        if (cityName == null || cityName.isEmpty()) {
            throw new RuntimeException("Şehir adı boş olamaz.");
        }
    }
}
