package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.service.ProductService;

@Controller
@RequestMapping("/admin/products")
@RequiredArgsConstructor
public class AdminProductController {

    private final ProductService productService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("products", productService.getAllProductWithCategory());
        return "admin/product/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/admin/products";
    }

    @GetMapping("/status-true/{id}")
    public String statusTrue(@PathVariable int id) {
        productService.productStatusChangeToTrue(id);
        return "redirect:/admin/products";
    }

    @GetMapping("/status-false/{id}")
    public String statusFalse(@PathVariable int id) {
        productService.productStatusChangeToFalse(id);
        return "redirect:/admin/products";
    }
}
