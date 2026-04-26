package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    List<ResultProductDto> getAllProductAsync();
    List<ResultProductWithCategoryDto> getAllProductWithCategoryAsync();
    void productDealOfTheDayStatusChangeToFalse(int id);
    void productDealOfTheDayStatusChangeToTrue(int id);
    List<ResultProductWithCategoryDto> getProductByDealOfTheDayTrueWithCategoryAsync();
}
