package tr.com.huseyinaydin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private Integer userId;
    private String name;
    private String userName;
    private String password;
    private Integer userRole;
    private String email;
    private String phoneNumber;
    private String userImageUrl;
}
