package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.appuser.ProfileUpdateDto;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.security.UserPrincipal;
import tr.com.huseyinaydin.service.AppUserService;

@RestController
@RequestMapping("/api/Profile")
public class ProfileController {
    private final AppUserService appUserService;

    public ProfileController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public ResponseEntity<AppUser> getProfile(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(appUserService.getById(userPrincipal.getUserId()));
    }

    @PutMapping
    public ResponseEntity<String> updateProfile(@RequestBody ProfileUpdateDto profileUpdateDto, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        profileUpdateDto.setUserId(userPrincipal.getUserId());
        appUserService.updateProfile(profileUpdateDto);
        return ResponseEntity.ok("Profil başarıyla güncellendi.");
    }
}
