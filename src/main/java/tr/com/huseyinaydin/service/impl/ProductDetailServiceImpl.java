package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.productdetail.GetProductDetailByIdDto;
import tr.com.huseyinaydin.repository.ProductDetailRepository;
import tr.com.huseyinaydin.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
    private final ProductDetailRepository productDetailRepository;

    public ProductDetailServiceImpl(ProductDetailRepository productDetailRepository) {
        this.productDetailRepository = productDetailRepository;
    }

    @Override
    public GetProductDetailByIdDto getProductDetailByProductId(int productId) {
        return productDetailRepository.getProductDetailByProductId(productId);
    }
}
