package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.chart.ResultChartDto;
import java.util.List;

@Mapper
public interface EstateAgentDashboardRepository {
    List<ResultChartDto> get5CityForChart();
    int productCountByEmployeeId(int id);
    int productCountByStatusTrue(int id);
    int productCountByStatusFalse(int id);
    int allProductCount();
}
