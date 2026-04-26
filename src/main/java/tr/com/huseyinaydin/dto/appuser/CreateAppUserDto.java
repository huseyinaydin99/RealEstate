package tr.com.huseyinaydin.dto.appuser;

public class CreateAppUserDto {
    private String name;
    private String userName;
    private String password;
    private int userRole;
    private String email;
    private String phoneNumber;
    private String userImageUrl;

    public CreateAppUserDto() {
    }

    public CreateAppUserDto(String name, String userName, String password, int userRole, String email, String phoneNumber, String userImageUrl) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userImageUrl = userImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }
}
