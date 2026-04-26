package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.repository.StatisticsRepository;
import tr.com.huseyinaydin.service.StatisticsService;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "statistics")
public class StatisticsServiceImpl implements StatisticsService {
    private final StatisticsRepository statisticsRepository;

    @Override
    @Cacheable(key = "'categoryCount'")
    public int categoryCount() {
        return statisticsRepository.categoryCount();
    }

    @Override
    @Cacheable(key = "'activeCategoryCount'")
    public int activeCategoryCount() {
        return statisticsRepository.activeCategoryCount();
    }

    @Override
    @Cacheable(key = "'passiveCategoryCount'")
    public int passiveCategoryCount() {
        return statisticsRepository.passiveCategoryCount();
    }

    @Override
    @Cacheable(key = "'productCount'")
    public int productCount() {
        return statisticsRepository.productCount();
    }

    @Override
    @Cacheable(key = "'apartmentCount'")
    public int apartmentCount() {
        return statisticsRepository.apartmentCount();
    }

    @Override
    @Cacheable(key = "'employeeNameByMaxProductCount'")
    public String employeeNameByMaxProductCount() {
        return statisticsRepository.employeeNameByMaxProductCount();
    }

    @Override
    @Cacheable(key = "'categoryNameByMaxProductCount'")
    public String categoryNameByMaxProductCount() {
        return statisticsRepository.categoryNameByMaxProductCount();
    }

    @Override
    @Cacheable(key = "'averageProductPriceByRent'")
    public BigDecimal averageProductPriceByRent() {
        return statisticsRepository.averageProductPriceByRent();
    }

    @Override
    @Cacheable(key = "'averageProductPriceBySale'")
    public BigDecimal averageProductPriceBySale() {
        return statisticsRepository.averageProductPriceBySale();
    }

    @Override
    @Cacheable(key = "'cityNameByMaxProductCount'")
    public String cityNameByMaxProductCount() {
        return statisticsRepository.cityNameByMaxProductCount();
    }

    @Override
    @Cacheable(key = "'differentCityCount'")
    public int differentCityCount() {
        return statisticsRepository.differentCityCount();
    }

    @Override
    @Cacheable(key = "'lastProductPrice'")
    public BigDecimal lastProductPrice() {
        return statisticsRepository.lastProductPrice();
    }

    @Override
    @Cacheable(key = "'newestBuildingYear'")
    public String newestBuildingYear() {
        return statisticsRepository.newestBuildingYear();
    }

    @Override
    @Cacheable(key = "'oldestBuildingYear'")
    public String oldestBuildingYear() {
        return statisticsRepository.oldestBuildingYear();
    }

    @Override
    @Cacheable(key = "'averageRoomCount'")
    public int averageRoomCount() {
        return statisticsRepository.averageRoomCount();
    }

    @Override
    @Cacheable(key = "'activeEmployeeCount'")
    public int activeEmployeeCount() {
        return statisticsRepository.activeEmployeeCount();
    }
}
