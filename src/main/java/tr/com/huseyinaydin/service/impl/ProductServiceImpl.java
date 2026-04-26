package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.business.rules.ProductBusinessRules;
import tr.com.huseyinaydin.dto.product.*;
import tr.com.huseyinaydin.repository.ProductRepository;
import tr.com.huseyinaydin.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<ResultProductWithCategoryDto> getAllProductWithCategory() {
        return productRepository.getAllProductWithCategory();
    }

    @Override
    public void createProduct(CreateProductDto createProductDto) {
        productRepository.createProduct(createProductDto);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public void productStatusChangeToTrue(int id) {
        productRepository.productStatusChangeToTrue(id);
    }

    @Override
    public void productStatusChangeToFalse(int id) {
        productRepository.productStatusChangeToFalse(id);
    }

    @Override
    public List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByTrue(int id) {
        return productRepository.getProductAdvertListByEmployeeAsyncByTrue(id);
    }

    @Override
    public List<ResultProductAdvertListWithCategoryByEmployeeDto> getProductAdvertListByEmployeeAsyncByFalse(int id) {
        return productRepository.getProductAdvertListByEmployeeAsyncByFalse(id);
    }

    @Override
    public List<ResultProductWithCategoryDto> getLast5ProductAsync() {
        return productRepository.getLast5ProductAsync();
    }

    @Override
    public List<ResultProductWithSearchListDto> resultProductWithSearchList(String searchKeyValue, int propertyCategoryId, String city) {
        return productRepository.resultProductWithSearchList(searchKeyValue, propertyCategoryId, city);
    }

    @Override
    public GetProductByProductIdDto getProductByProductId(int id) {
        return productRepository.getProductByProductId(id);
    }
}
