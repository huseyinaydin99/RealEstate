package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.productdetail.GetProductDetailByIdDto;

public interface ProductDetailService {
    GetProductDetailByIdDto getProductDetailByProductId(int productId);
}
