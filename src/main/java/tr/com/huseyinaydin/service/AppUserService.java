package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.appuser.CreateAppUserDto;
import tr.com.huseyinaydin.dto.appuser.ProfileUpdateDto;
import tr.com.huseyinaydin.model.AppUser;
import java.util.List;

public interface AppUserService {
    void register(CreateAppUserDto createAppUserDto);
    void updateProfile(ProfileUpdateDto profileUpdateDto);
    AppUser getById(int id);
    AppUser getByUserName(String userName);
    List<AppUser> getAllUsers();
    void deleteUser(int id);
}
