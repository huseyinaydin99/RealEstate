package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.category.CreateCategoryDto;
import tr.com.huseyinaydin.dto.category.UpdateCategoryDto;
import tr.com.huseyinaydin.validation.CategoryValidator;
import tr.com.huseyinaydin.service.CategoryService;

@Controller
@RequestMapping("/admin/categories")
public class AdminCategoryController {

    private final CategoryService categoryService;

    public AdminCategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        return "admin/category/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", new CreateCategoryDto());
        return "admin/category/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute CreateCategoryDto createCategoryDto, Model model) {
        try {
            CategoryValidator.validateCreate(createCategoryDto);
            categoryService.createCategory(createCategoryDto);
            return "redirect:/admin/categories";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("category", createCategoryDto);
            return "admin/category/create";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        categoryService.deleteCategory(id);
        return "redirect:/admin/categories";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("category", categoryService.getCategory(id));
        return "admin/category/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute UpdateCategoryDto updateCategoryDto, Model model) {
        try {
            CategoryValidator.validateUpdate(updateCategoryDto);
            categoryService.updateCategory(updateCategoryDto);
            return "redirect:/admin/categories";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("category", updateCategoryDto);
            return "admin/category/update";
        }
    }
}
