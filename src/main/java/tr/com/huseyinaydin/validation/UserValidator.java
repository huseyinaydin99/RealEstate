package tr.com.huseyinaydin.validation;

import tr.com.huseyinaydin.dto.appuser.CreateAppUserDto;
import tr.com.huseyinaydin.dto.login.LoginRequestDto;

public class UserValidator {
    public static void validateRegister(CreateAppUserDto dto) {
        if (dto.getUserName() == null || dto.getUserName().trim().isEmpty()) {
            throw new RuntimeException("Kullanıcı adı boş geçilemez.");
        }
        if (dto.getPassword() == null || dto.getPassword().length() < 6) {
            throw new RuntimeException("Şifre en az 6 karakter olmalıdır.");
        }
        if (dto.getEmail() == null || !dto.getEmail().contains("@")) {
            throw new RuntimeException("Geçerli bir e-posta adresi giriniz.");
        }
        if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            throw new RuntimeException("Ad Soyad alanı boş geçilemez.");
        }
    }

    public static void validateLogin(LoginRequestDto dto) {
        if (dto.getUsername() == null || dto.getUsername().trim().isEmpty()) {
            throw new RuntimeException("Kullanıcı adı boş geçilemez.");
        }
        if (dto.getPassword() == null || dto.getPassword().trim().isEmpty()) {
            throw new RuntimeException("Şifre boş geçilemez.");
        }
    }
}
