package tr.com.huseyinaydin.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.service.AppUserService;

@Controller
@RequestMapping("/admin/users")
public class AdminUserController {

    private final AppUserService appUserService;

    public AdminUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", appUserService.getAllUsers());
        return "admin/user/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        appUserService.deleteUser(id);
        return "redirect:/admin/users";
    }
}
