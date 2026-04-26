package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.service.StatisticsService;

@Controller
@RequestMapping("/admin/statistics")
@RequiredArgsConstructor
public class AdminStatisticsController {
    private final StatisticsService statisticsService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeCategoryCount", statisticsService.activeCategoryCount());
        model.addAttribute("activeEmployeeCount", statisticsService.activeEmployeeCount());
        model.addAttribute("apartmentCount", statisticsService.apartmentCount());
        model.addAttribute("averageProductPriceByRent", statisticsService.averageProductPriceByRent());
        model.addAttribute("averageProductPriceBySale", statisticsService.averageProductPriceBySale());
        model.addAttribute("averageRoomCount", statisticsService.averageRoomCount());
        model.addAttribute("categoryCount", statisticsService.categoryCount());
        model.addAttribute("categoryNameByMaxProductCount", statisticsService.categoryNameByMaxProductCount());
        model.addAttribute("cityNameByMaxProductCount", statisticsService.cityNameByMaxProductCount());
        model.addAttribute("differentCityCount", statisticsService.differentCityCount());
        model.addAttribute("employeeNameByMaxProductCount", statisticsService.employeeNameByMaxProductCount());
        model.addAttribute("lastProductPrice", statisticsService.lastProductPrice());
        model.addAttribute("newestBuildingYear", statisticsService.newestBuildingYear());
        model.addAttribute("oldestBuildingYear", statisticsService.oldestBuildingYear());
        model.addAttribute("passiveCategoryCount", statisticsService.passiveCategoryCount());
        model.addAttribute("productCount", statisticsService.productCount());
        return "admin/statistics/index";
    }
}
