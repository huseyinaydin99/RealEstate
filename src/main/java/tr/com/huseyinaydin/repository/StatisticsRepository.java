package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import java.math.BigDecimal;

@Mapper
public interface StatisticsRepository {
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
