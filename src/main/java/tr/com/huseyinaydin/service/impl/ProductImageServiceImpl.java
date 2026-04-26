package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.productimage.CreateProductImageDto;
import tr.com.huseyinaydin.dto.productimage.GetProductImageByProductIdDto;
import tr.com.huseyinaydin.dto.productimage.ResultProductImageDto;
import tr.com.huseyinaydin.repository.ProductImageMapper;
import tr.com.huseyinaydin.service.ProductImageService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImageServiceImpl implements ProductImageService {
    private final ProductImageMapper productImageMapper;

    @Override
    public List<GetProductImageByProductIdDto> getProductImageByProductId(int id) {
        return productImageMapper.getProductImageByProductId(id);
    }

    @Override
    public List<ResultProductImageDto> getAllProductImages() {
        return productImageMapper.getAllProductImages();
    }

    @Override
    public void createProductImage(CreateProductImageDto createProductImageDto) {
        productImageMapper.createProductImage(createProductImageDto);
    }

    @Override
    public void deleteProductImage(int id) {
        productImageMapper.deleteProductImage(id);
    }

    @Override
    public String getImageUrl(int id) {
        return productImageMapper.getImageUrl(id);
    }

    @Override
    public List<ResultProductImageDto> getAllProductImagesByAppUserId(int id) {
        return productImageMapper.getAllProductImagesByAppUserId(id);
    }
}
