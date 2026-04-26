package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.login.LoginRequestDto;
import tr.com.huseyinaydin.dto.login.LoginResponseDto;
import tr.com.huseyinaydin.model.AppRole;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.repository.AppUserRepository;
import tr.com.huseyinaydin.security.JwtTokenGenerator;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/Login")
@RequiredArgsConstructor
public class LoginController {

    private final AppUserRepository appUserRepository;
    private final JwtTokenGenerator jwtTokenGenerator;

    @PostMapping
    public ResponseEntity<?> signIn(@RequestBody LoginRequestDto loginDto) {
        AppUser user = appUserRepository.findByUserNameAndPassword(loginDto.getUsername(), loginDto.getPassword());

        if (user != null) {
            AppRole role = appUserRepository.findRoleByUserId(user.getUserId());

            if (role != null) {
                String token = jwtTokenGenerator.generateToken(user.getUserId(), user.getUserName(), role.getRoleName());
                String redirectUrl = "";

                if (role.getRoleName().equals("Admin")) {
                    redirectUrl = "/Dashboard/Index";
                } else if (role.getRoleName().equals("Employee") || role.getRoleName().equals("Manager")) {
                    redirectUrl = "/EstateAgent/Dashboard/Index";
                } else {
                    redirectUrl = "/Default/Index";
                }

                return ResponseEntity.ok(new LoginResponseDto(token, redirectUrl));
            } else {
                return ResponseEntity.ok("Rol bulunamadı.");
            }
        } else {
            return ResponseEntity.ok("Başarısız");
        }
    }

    @PostMapping("/Logout")
    public ResponseEntity<?> logout() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Başarıyla çıkış yapıldı.");
        return ResponseEntity.ok(response);
    }
}
