package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.product.*;

import java.util.List;

public interface ProductService {
    List<ResultProductWithCategoryDto> getAllProductWithCategory();
    void createProduct(CreateProductDto createProductDto);
    void deleteProduct(int id);
    void productStatusChangeToTrue(int id);
    void productStatusChangeToFalse(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByTrue(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByFalse(int id);
    List<ResultProductWithCategoryDto> getLast5ProductAsync();
    List<ResultProductWithSearchListDto> resultProductWithSearchList(String searchKeyValue, int propertyCategoryId, String city);
    GetProductByProductIdDto getProductByProductId(int id);
}
