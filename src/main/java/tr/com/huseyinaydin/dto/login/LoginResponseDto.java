package tr.com.huseyinaydin.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LoginResponseDto {
    private String token;
    private String redirectUrl;

    public LoginResponseDto() {}

    public LoginResponseDto(String token, String redirectUrl) {
        this.token = token;
        this.redirectUrl = redirectUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
