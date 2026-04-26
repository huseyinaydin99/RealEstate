package tr.com.huseyinaydin.dto.appuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAppUserDto {
    private String name;
    private String userName;
    private String password;
    private int userRole;
    private String email;
    private String phoneNumber;
    private String userImageUrl;
}
