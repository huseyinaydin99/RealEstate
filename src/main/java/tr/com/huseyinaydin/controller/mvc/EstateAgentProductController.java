package tr.com.huseyinaydin.controller.mvc;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.product.CreateProductDto;
import tr.com.huseyinaydin.security.UserPrincipal;
import tr.com.huseyinaydin.service.CategoryService;
import tr.com.huseyinaydin.service.ProductService;

@Controller
@RequestMapping("/estateagent")
public class EstateAgentProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    public EstateAgentProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/myadverts/active")
    public String activeAdverts(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("products", productService.getProductAdvertListByEmployeeAsyncByTrue(principal.getUserId()));
        return "estateagent/adverts/active";
    }

    @GetMapping("/myadverts/passive")
    public String passiveAdverts(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("products", productService.getProductAdvertListByEmployeeAsyncByFalse(principal.getUserId()));
        return "estateagent/adverts/passive";
    }

    @GetMapping("/adverts/create")
    public String create(Model model) {
        model.addAttribute("product", new CreateProductDto());
        model.addAttribute("categories", categoryService.getAllCategory());
        return "estateagent/adverts/create";
    }

    @PostMapping("/adverts/create")
    public String create(@ModelAttribute CreateProductDto createProductDto, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        createProductDto.setAppUserId(principal.getUserId());
        productService.createProduct(createProductDto);
        return "redirect:/estateagent/myadverts/active";
    }

    @GetMapping("/adverts/status-true/{id}")
    public String statusTrue(@PathVariable int id) {
        productService.productStatusChangeToTrue(id);
        return "redirect:/estateagent/myadverts/passive";
    }

    @GetMapping("/adverts/status-false/{id}")
    public String statusFalse(@PathVariable int id) {
        productService.productStatusChangeToFalse(id);
        return "redirect:/estateagent/myadverts/active";
    }
}
