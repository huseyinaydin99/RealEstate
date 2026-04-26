package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.product.ResultProductDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;
import tr.com.huseyinaydin.repository.ProductRepository;
import tr.com.huseyinaydin.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ResultProductDto> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public List<ResultProductWithCategoryDto> getAllProductWithCategory() {
        return productRepository.getAllProductWithCategory();
    }

    @Override
    public void productDealOfTheDayStatusChangeToTrue(int id) {
        productRepository.productDealOfTheDayStatusChangeToTrue(id);
    }

    @Override
    public void productDealOfTheDayStatusChangeToFalse(int id) {
        productRepository.productDealOfTheDayStatusChangeToFalse(id);
    }
}
