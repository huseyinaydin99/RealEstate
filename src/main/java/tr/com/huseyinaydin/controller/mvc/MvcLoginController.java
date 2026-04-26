package tr.com.huseyinaydin.controller.mvc;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.login.LoginRequestDto;
import tr.com.huseyinaydin.dto.login.LoginResponseDto;
import tr.com.huseyinaydin.model.AppRole;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.repository.AppUserRepository;
import tr.com.huseyinaydin.security.JwtTokenGenerator;

@Controller
@RequestMapping("/Login")
public class MvcLoginController {

    private final AppUserRepository appUserRepository;
    private final JwtTokenGenerator jwtTokenGenerator;

    public MvcLoginController(AppUserRepository appUserRepository, JwtTokenGenerator jwtTokenGenerator) {
        this.appUserRepository = appUserRepository;
        this.jwtTokenGenerator = jwtTokenGenerator;
    }

    @GetMapping("/Index")
    public String index() {
        return "login/index";
    }

    @PostMapping("/Index")
    public String index(@ModelAttribute LoginRequestDto loginDto, HttpServletResponse response, Model model) {
        AppUser user = appUserRepository.findByUserNameAndPassword(loginDto.getUsername(), loginDto.getPassword());

        if (user != null) {
            AppRole role = appUserRepository.findRoleByUserId(user.getUserId());

            if (role != null) {
                String token = jwtTokenGenerator.generateToken(user.getUserId(), user.getUserName(), role.getRoleName(), user.getName(), user.getEmail(), user.getUserImageUrl());
                
                Cookie cookie = new Cookie("RealEstateJwt", token);
                cookie.setHttpOnly(true);
                cookie.setPath("/");
                cookie.setMaxAge(3600);
                response.addCookie(cookie);

                if (role.getRoleName().equals("Admin")) {
                    return "redirect:/admin/dashboard";
                } else if (role.getRoleName().equals("Employee") || role.getRoleName().equals("Manager")) {
                    return "redirect:/estateagent/dashboard";
                } else {
                    return "redirect:/";
                }
            }
        }
        model.addAttribute("error", "Kullanıcı adı veya şifre hatalı!");
        return "login/index";
    }

    @GetMapping("/Logout")
    public String logout(HttpServletResponse response) {
        Cookie cookie = new Cookie("RealEstateJwt", null);
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/Login/Index";
    }
}
