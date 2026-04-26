package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.product.CreateProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductAdvertListWithCategoryByEmployeeDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    List<ResultProductWithCategoryDto> getAllProductWithCategory();
    void createProduct(CreateProductDto createProductDto);
    void deleteProduct(int id);
    void productStatusChangeToTrue(int id);
    void productStatusChangeToFalse(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByTrue(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByFalse(int id);
}
