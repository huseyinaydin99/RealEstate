package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.appuser.CreateAppUserDto;
import tr.com.huseyinaydin.dto.login.LoginRequestDto;
import tr.com.huseyinaydin.dto.login.LoginResponseDto;
import tr.com.huseyinaydin.model.AppRole;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.repository.AppUserRepository;
import tr.com.huseyinaydin.security.JwtTokenGenerator;
import tr.com.huseyinaydin.service.AppUserService;
import tr.com.huseyinaydin.validation.UserValidator;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/Login")
public class LoginController {
    private final AppUserRepository appUserRepository;
    private final JwtTokenGenerator jwtTokenGenerator;
    private final AppUserService appUserService;

    public LoginController(AppUserRepository appUserRepository, JwtTokenGenerator jwtTokenGenerator, AppUserService appUserService) {
        this.appUserRepository = appUserRepository;
        this.jwtTokenGenerator = jwtTokenGenerator;
        this.appUserService = appUserService;
    }

    @PostMapping
    public ResponseEntity<?> signIn(@RequestBody LoginRequestDto loginDto) {
        UserValidator.validateLogin(loginDto);
        AppUser user = appUserRepository.findByUserNameAndPassword(loginDto.getUsername(), loginDto.getPassword());

        if (user != null) {
            AppRole role = appUserRepository.findRoleByUserId(user.getUserId());

            if (role != null) {
                String token = jwtTokenGenerator.generateToken(user.getUserId(), user.getUserName(), role.getRoleName(), user.getName(), user.getEmail(), user.getUserImageUrl());
                String redirectUrl = "";

                if (role.getRoleName().equals("Admin")) {
                    redirectUrl = "/admin/dashboard";
                } else if (role.getRoleName().equals("Employee") || role.getRoleName().equals("Manager")) {
                    redirectUrl = "/estateagent/dashboard";
                } else {
                    redirectUrl = "/default/index";
                }

                return ResponseEntity.ok(new LoginResponseDto(token, redirectUrl));
            } else {
                return ResponseEntity.ok("Rol bulunamadı.");
            }
        } else {
            return ResponseEntity.ok("Başarısız");
        }
    }

    @PostMapping("/Register")
    public ResponseEntity<?> register(@RequestBody CreateAppUserDto createAppUserDto) {
        UserValidator.validateRegister(createAppUserDto);
        if (createAppUserDto.getUserRole() == 0) {
            Integer roleId = appUserRepository.getRoleIdByRoleName("Member");
            if (roleId != null) {
                createAppUserDto.setUserRole(roleId);
            }
        }
        appUserService.register(createAppUserDto);
        return ResponseEntity.ok("Kayıt başarılı.");
    }

    @PostMapping("/Logout")
    public ResponseEntity<?> logout() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Başarıyla çıkış yapıldı.");
        return ResponseEntity.ok(response);
    }
}
