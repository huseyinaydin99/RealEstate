package tr.com.huseyinaydin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.service.EstateAgentDashboardService;

@RestController
@RequestMapping("api/EstateAgentDashboard")
@RequiredArgsConstructor
@Tag(name = "EstateAgentDashboard", description = "Emlakçı Dashboard İstatistikleri")
public class EstateAgentDashboardController {
    private final EstateAgentDashboardService service;

    @GetMapping("/ProductCountByEmployeeId")
    public ResponseEntity<Integer> productCountByEmployeeId(@RequestParam int id) {
        return ResponseEntity.ok(service.productCountByEmployeeId(id));
    }

    @GetMapping("/ProductCountByStatusTrue")
    public ResponseEntity<Integer> productCountByStatusTrue(@RequestParam int id) {
        return ResponseEntity.ok(service.productCountByStatusTrue(id));
    }

    @GetMapping("/ProductCountByStatusFalse")
    public ResponseEntity<Integer> productCountByStatusFalse(@RequestParam int id) {
        return ResponseEntity.ok(service.productCountByStatusFalse(id));
    }

    @GetMapping("/AllProductCount")
    public ResponseEntity<Integer> allProductCount() {
        return ResponseEntity.ok(service.allProductCount());
    }
}
