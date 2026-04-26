package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

@Mapper
public interface ProductRepository {
    List<ResultProductDto> getAllProduct();
    List<ResultProductWithCategoryDto> getAllProductWithCategory();
    void productDealOfTheDayStatusChangeToTrue(int id);
    void productDealOfTheDayStatusChangeToFalse(int id);
    // Diğer metodlar zamanla eklenecek
}
