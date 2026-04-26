package tr.com.huseyinaydin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.service.StatisticsService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/Statistics")
@Tag(name = "Statistics", description = "Statistics API")
public class StatisticsController {
    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/ActiveCategoryCount")
    public ResponseEntity<Integer> activeCategoryCount() {
        return ResponseEntity.ok(statisticsService.activeCategoryCount());
    }

    @GetMapping("/ActiveEmployeeCount")
    public ResponseEntity<Integer> activeEmployeeCount() {
        return ResponseEntity.ok(statisticsService.activeEmployeeCount());
    }

    @GetMapping("/ApartmentCount")
    public ResponseEntity<Integer> apartmentCount() {
        return ResponseEntity.ok(statisticsService.apartmentCount());
    }

    @GetMapping("/AverageProductPriceByRent")
    public ResponseEntity<BigDecimal> averageProductPriceByRent() {
        return ResponseEntity.ok(statisticsService.averageProductPriceByRent());
    }

    @GetMapping("/AverageProductPriceBySale")
    public ResponseEntity<BigDecimal> averageProductPriceBySale() {
        return ResponseEntity.ok(statisticsService.averageProductPriceBySale());
    }

    @GetMapping("/AverageRoomCount")
    public ResponseEntity<Integer> averageRoomCount() {
        return ResponseEntity.ok(statisticsService.averageRoomCount());
    }

    @GetMapping("/CategoryCount")
    public ResponseEntity<Integer> categoryCount() {
        return ResponseEntity.ok(statisticsService.categoryCount());
    }

    @GetMapping("/CategoryNameByMaxProductCount")
    public ResponseEntity<String> categoryNameByMaxProductCount() {
        return ResponseEntity.ok(statisticsService.categoryNameByMaxProductCount());
    }

    @GetMapping("/CityNameByMaxProductCount")
    public ResponseEntity<String> cityNameByMaxProductCount() {
        return ResponseEntity.ok(statisticsService.cityNameByMaxProductCount());
    }

    @GetMapping("/DifferentCityCount")
    public ResponseEntity<Integer> differentCityCount() {
        return ResponseEntity.ok(statisticsService.differentCityCount());
    }

    @GetMapping("/EmployeeNameByMaxProductCount")
    public ResponseEntity<String> employeeNameByMaxProductCount() {
        return ResponseEntity.ok(statisticsService.employeeNameByMaxProductCount());
    }

    @GetMapping("/LastProductPrice")
    public ResponseEntity<BigDecimal> lastProductPrice() {
        return ResponseEntity.ok(statisticsService.lastProductPrice());
    }

    @GetMapping("/NewestBuildingYear")
    public ResponseEntity<String> newestBuildingYear() {
        return ResponseEntity.ok(statisticsService.newestBuildingYear());
    }

    @GetMapping("/OldestBuildingYear")
    public ResponseEntity<String> oldestBuildingYear() {
        return ResponseEntity.ok(statisticsService.oldestBuildingYear());
    }

    @GetMapping("/PassiveCategoryCount")
    public ResponseEntity<Integer> passiveCategoryCount() {
        return ResponseEntity.ok(statisticsService.passiveCategoryCount());
    }

    @GetMapping("/ProductCount")
    public ResponseEntity<Integer> productCount() {
        return ResponseEntity.ok(statisticsService.productCount());
    }
}
