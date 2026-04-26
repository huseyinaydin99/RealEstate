package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    List<ResultProductDto> getAllProduct();
    List<ResultProductWithCategoryDto> getAllProductWithCategory();
    void productDealOfTheDayStatusChangeToTrue(int id);
    void productDealOfTheDayStatusChangeToFalse(int id);
}
