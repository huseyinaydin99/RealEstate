package tr.com.huseyinaydin.business.rules;

public class AppUserBusinessRules {
    public static void checkIfUserAlreadyExists(boolean exists) {
        if (exists) {
            throw new RuntimeException("Bu kullanıcı adı zaten alınmış.");
        }
    }

    public static void checkIfPasswordsMatch(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new RuntimeException("Şifreler uyuşmuyor.");
        }
    }
}
