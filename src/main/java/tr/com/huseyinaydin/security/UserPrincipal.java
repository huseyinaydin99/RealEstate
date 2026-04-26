package tr.com.huseyinaydin.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class UserPrincipal extends User {
    private final Integer userId;
    private final String imageUrl;

    public UserPrincipal(Integer userId, String username, String password, String imageUrl, Collection<? extends GrantedAuthority> authorities) {
        super(username, password != null ? password : "", authorities);
        this.userId = userId;
        this.imageUrl = imageUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
