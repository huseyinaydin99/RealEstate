package tr.com.huseyinaydin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.dto.chart.ResultChartDto;
import tr.com.huseyinaydin.service.EstateAgentDashboardService;

import java.util.List;

@RestController
@RequestMapping("api/EstateAgentCharts")
@RequiredArgsConstructor
@Tag(name = "EstateAgentCharts", description = "Grafik Verileri")
public class EstateAgentChartsController {
    private final EstateAgentDashboardService service;

    @GetMapping("/Get5CityForChart")
    public ResponseEntity<List<ResultChartDto>> get5CityForChart() {
        return ResponseEntity.ok(service.get5CityForChart());
    }
}
