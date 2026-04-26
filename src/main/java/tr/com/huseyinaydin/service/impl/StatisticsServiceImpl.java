package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.repository.StatisticsRepository;
import tr.com.huseyinaydin.service.StatisticsService;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {
    private final StatisticsRepository statisticsRepository;

    @Override
    public int categoryCount() {
        return statisticsRepository.categoryCount();
    }

    @Override
    public int activeCategoryCount() {
        return statisticsRepository.activeCategoryCount();
    }

    @Override
    public int passiveCategoryCount() {
        return statisticsRepository.passiveCategoryCount();
    }

    @Override
    public int productCount() {
        return statisticsRepository.productCount();
    }

    @Override
    public int apartmentCount() {
        return statisticsRepository.apartmentCount();
    }

    @Override
    public String employeeNameByMaxProductCount() {
        return statisticsRepository.employeeNameByMaxProductCount();
    }

    @Override
    public String categoryNameByMaxProductCount() {
        return statisticsRepository.categoryNameByMaxProductCount();
    }

    @Override
    public BigDecimal averageProductPriceByRent() {
        return statisticsRepository.averageProductPriceByRent();
    }

    @Override
    public BigDecimal averageProductPriceBySale() {
        return statisticsRepository.averageProductPriceBySale();
    }

    @Override
    public String cityNameByMaxProductCount() {
        return statisticsRepository.cityNameByMaxProductCount();
    }

    @Override
    public int differentCityCount() {
        return statisticsRepository.differentCityCount();
    }

    @Override
    public BigDecimal lastProductPrice() {
        return statisticsRepository.lastProductPrice();
    }

    @Override
    public String newestBuildingYear() {
        return statisticsRepository.newestBuildingYear();
    }

    @Override
    public String oldestBuildingYear() {
        return statisticsRepository.oldestBuildingYear();
    }

    @Override
    public int averageRoomCount() {
        return statisticsRepository.averageRoomCount();
    }

    @Override
    public int activeEmployeeCount() {
        return statisticsRepository.activeEmployeeCount();
    }
}
