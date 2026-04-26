package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.chart.ResultChartDto;
import java.util.List;

public interface EstateAgentDashboardService {
    List<ResultChartDto> get5CityForChart();
    int productCountByEmployeeId(int id);
    int productCountByStatusTrue(int id);
    int productCountByStatusFalse(int id);
    int allProductCount();
}
