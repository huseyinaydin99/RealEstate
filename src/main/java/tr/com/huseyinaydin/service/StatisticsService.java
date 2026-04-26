package tr.com.huseyinaydin.service;

import java.math.BigDecimal;

public interface StatisticsService {
    int categoryCount();
    int activeCategoryCount();
    int passiveCategoryCount();
    int productCount();
    int apartmentCount();
    String employeeNameByMaxProductCount();
    String categoryNameByMaxProductCount();
    BigDecimal averageProductPriceByRent();
    BigDecimal averageProductPriceBySale();
    String cityNameByMaxProductCount();
    int differentCityCount();
    BigDecimal lastProductPrice();
    String newestBuildingYear();
    String oldestBuildingYear();
    int averageRoomCount();
    int activeEmployeeCount();
}
