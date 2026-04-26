package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.business.rules.AppUserBusinessRules;
import tr.com.huseyinaydin.dto.appuser.CreateAppUserDto;
import tr.com.huseyinaydin.dto.appuser.ProfileUpdateDto;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.repository.AppUserRepository;
import tr.com.huseyinaydin.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {
    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void register(CreateAppUserDto createAppUserDto) {
        AppUser existingUser = appUserRepository.findByUserName(createAppUserDto.getUserName());
        AppUserBusinessRules.checkIfUserAlreadyExists(existingUser != null);
        
        AppUser user = new AppUser();
        user.setName(createAppUserDto.getName());
        user.setUserName(createAppUserDto.getUserName());
        user.setPassword(createAppUserDto.getPassword());
        user.setUserRole(createAppUserDto.getUserRole());
        user.setEmail(createAppUserDto.getEmail());
        user.setPhoneNumber(createAppUserDto.getPhoneNumber());
        user.setUserImageUrl(createAppUserDto.getUserImageUrl());
        
        appUserRepository.createAppUser(user);
    }

    @Override
    public void updateProfile(ProfileUpdateDto profileUpdateDto) {
        AppUser user = appUserRepository.findByUserId(profileUpdateDto.getUserId());
        if (user != null) {
            user.setName(profileUpdateDto.getName());
            user.setUserName(profileUpdateDto.getUserName());
            user.setPassword(profileUpdateDto.getPassword());
            user.setEmail(profileUpdateDto.getEmail());
            user.setPhoneNumber(profileUpdateDto.getPhoneNumber());
            user.setUserImageUrl(profileUpdateDto.getUserImageUrl());
            appUserRepository.updateAppUser(user);
        }
    }

    @Override
    public AppUser getById(int id) {
        return appUserRepository.findByUserId(id);
    }

    @Override
    public AppUser getByUserName(String userName) {
        return appUserRepository.findByUserName(userName);
    }
}
