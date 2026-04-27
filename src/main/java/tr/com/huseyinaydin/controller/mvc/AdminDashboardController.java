package tr.com.huseyinaydin.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.service.ProductService;
import tr.com.huseyinaydin.service.StatisticsService;
import tr.com.huseyinaydin.service.ToDoListService;

@Controller
@RequestMapping("/admin/dashboard")
public class AdminDashboardController {

    private final StatisticsService statisticsService;
    private final ToDoListService toDoListService;
    private final ProductService productService;

    public AdminDashboardController(StatisticsService statisticsService, ToDoListService toDoListService, ProductService productService) {
        this.statisticsService = statisticsService;
        this.toDoListService = toDoListService;
        this.productService = productService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("productCount", statisticsService.productCount());
        model.addAttribute("categoryCount", statisticsService.categoryCount());
        model.addAttribute("activeEmployeeCount", statisticsService.activeEmployeeCount());
        model.addAttribute("differentCityCount", statisticsService.differentCityCount());
        
        model.addAttribute("toDoList", toDoListService.getAllToDoList());
        model.addAttribute("last5Products", productService.getLast5ProductAsync());
        
        return "admin/dashboard/index";
    }
}
