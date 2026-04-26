package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tr.com.huseyinaydin.dto.product.*;

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
    List<ResultProductWithCategoryDto> getLast5ProductAsync();
    List<ResultProductWithSearchListDto> resultProductWithSearchList(@Param("searchKeyValue") String searchKeyValue, @Param("propertyCategoryId") int propertyCategoryId, @Param("city") String city);
    GetProductByProductIdDto getProductByProductId(int id);
}
