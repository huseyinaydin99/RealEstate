package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.dto.appuser.CreateAppUserDto;
import tr.com.huseyinaydin.repository.AppUserRepository;
import tr.com.huseyinaydin.service.AppUserService;

@Controller
@RequestMapping("/Register")
public class MvcRegisterController {
    private final AppUserService appUserService;
    private final AppUserRepository appUserRepository;

    public MvcRegisterController(AppUserService appUserService, AppUserRepository appUserRepository) {
        this.appUserService = appUserService;
        this.appUserRepository = appUserRepository;
    }

    @GetMapping("/Index")
    public String index(Model model) {
        model.addAttribute("appUser", new CreateAppUserDto());
        return "register/index";
    }

    /*
    @GetMapping("/Login")
    public String login(Model model) {
        model.addAttribute("appUser", new CreateAppUserDto());
        return "redirect:/Login/Index";
    }
    */

    @PostMapping("/Index")
    public String index(@ModelAttribute CreateAppUserDto createAppUserDto) {
        if (createAppUserDto.getUserRole() == 0) {
            Integer roleId = appUserRepository.getRoleIdByRoleName("Member");
            if (roleId != null) {
                createAppUserDto.setUserRole(roleId);
            }
        }
        appUserService.register(createAppUserDto);
        return "redirect:/Login/Index";
    }
}
