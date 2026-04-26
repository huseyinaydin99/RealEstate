package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.productdetail.GetProductDetailByIdDto;

@Mapper
public interface ProductDetailRepository {
    GetProductDetailByIdDto getProductDetailByProductId(int productId);
}
