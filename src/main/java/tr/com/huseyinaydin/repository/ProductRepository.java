package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.product.CreateProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductAdvertListWithCategoryByEmployeeDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;

import java.util.List;

@Mapper
public interface ProductRepository {
    List<ResultProductWithCategoryDto> getAllProductWithCategory();
    void createProduct(CreateProductDto createProductDto);
    void deleteProduct(int id);
    void productStatusChangeToTrue(int id);
    void productStatusChangeToFalse(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByTrue(int id);
    List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByFalse(int id);
}
