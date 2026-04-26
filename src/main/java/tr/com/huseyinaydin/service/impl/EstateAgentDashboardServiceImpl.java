package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.chart.ResultChartDto;
import tr.com.huseyinaydin.repository.EstateAgentDashboardRepository;
import tr.com.huseyinaydin.service.EstateAgentDashboardService;

import java.util.List;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "statistics")
public class EstateAgentDashboardServiceImpl implements EstateAgentDashboardService {
    private final EstateAgentDashboardRepository repository;

    @Override
    @Cacheable(key = "'get5CityForChart'")
    public List<ResultChartDto> get5CityForChart() {
        return repository.get5CityForChart();
    }

    @Override
    public int productCountByEmployeeId(int id) {
        return repository.productCountByEmployeeId(id);
    }

    @Override
    public int productCountByStatusTrue(int id) {
        return repository.productCountByStatusTrue(id);
    }

    @Override
    public int productCountByStatusFalse(int id) {
        return repository.productCountByStatusFalse(id);
    }

    @Override
    public int allProductCount() {
        return repository.allProductCount();
    }
}
