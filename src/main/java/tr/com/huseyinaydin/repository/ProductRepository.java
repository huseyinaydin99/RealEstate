package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

@Mapper
public interface ProductRepository {
    List<ResultProductDto> getAllProductAsync();
    List<ResultProductWithCategoryDto> getAllProductWithCategoryAsync();
    void productDealOfTheDayStatusChangeToFalse(int id);
    void productDealOfTheDayStatusChangeToTrue(int id);
    List<ResultProductWithCategoryDto> getProductByDealOfTheDayTrueWithCategoryAsync();
}
