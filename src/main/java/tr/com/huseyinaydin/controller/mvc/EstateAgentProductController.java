package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.security.UserPrincipal;
import tr.com.huseyinaydin.service.ProductService;

@Controller
@RequestMapping("/estateagent/myadverts")
public class EstateAgentProductController {

    private final ProductService productService;

    public EstateAgentProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/active")
    public String activeAdverts(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("products", productService.getProductAdvertListByEmployeeAsyncByTrue(principal.getUserId()));
        return "estateagent/adverts/active";
    }

    @GetMapping("/passive")
    public String passiveAdverts(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("products", productService.getProductAdvertListByEmployeeAsyncByFalse(principal.getUserId()));
        return "estateagent/adverts/passive";
    }
}
