package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.productimage.CreateProductImageDto;
import tr.com.huseyinaydin.dto.productimage.GetProductImageByProductIdDto;
import tr.com.huseyinaydin.dto.productimage.ResultProductImageDto;

import java.util.List;

@Mapper
public interface ProductImageMapper {
    List<GetProductImageByProductIdDto> getProductImageByProductId(int id);
    List<ResultProductImageDto> getAllProductImages();
    void createProductImage(CreateProductImageDto createProductImageDto);
    void deleteProductImage(int id);
    String getImageUrl(int id);
    List<ResultProductImageDto> getAllProductImagesByAppUserId(int id);
}
