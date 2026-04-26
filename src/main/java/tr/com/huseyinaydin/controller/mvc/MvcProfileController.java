package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.dto.appuser.ProfileUpdateDto;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.security.UserPrincipal;
import tr.com.huseyinaydin.service.AppUserService;

@Controller
@RequestMapping("/Profile")
@RequiredArgsConstructor
public class MvcProfileController {
    private final AppUserService appUserService;

    @GetMapping("/Index")
    public String index(@AuthenticationPrincipal UserPrincipal userPrincipal, Model model) {
        AppUser user = appUserService.getById(userPrincipal.getUserId());
        ProfileUpdateDto profileUpdateDto = ProfileUpdateDto.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .userName(user.getUserName())
                .password(user.getPassword())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .userImageUrl(user.getUserImageUrl())
                .userRole(user.getUserRole())
                .build();
        model.addAttribute("profile", profileUpdateDto);
        return "admin/profile/index";
    }

    @PostMapping("/Update")
    public String update(@ModelAttribute ProfileUpdateDto profileUpdateDto, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        profileUpdateDto.setUserId(userPrincipal.getUserId());
        appUserService.updateProfile(profileUpdateDto);
        return "redirect:/Profile/Index";
    }
}
