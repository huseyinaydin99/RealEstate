package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.category.CreateCategoryDto;
import tr.com.huseyinaydin.dto.category.ResultCategoryDto;
import tr.com.huseyinaydin.dto.category.UpdateCategoryDto;
import tr.com.huseyinaydin.repository.CategoryRepository;
import tr.com.huseyinaydin.service.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<ResultCategoryDto> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public void createCategory(CreateCategoryDto createCategoryDto) {
        categoryRepository.createCategory(createCategoryDto);
    }

    @Override
    public void deleteCategory(int categoryId) {
        categoryRepository.deleteCategory(categoryId);
    }

    @Override
    public void updateCategory(UpdateCategoryDto updateCategoryDto) {
        categoryRepository.updateCategory(updateCategoryDto);
    }

    @Override
    public ResultCategoryDto getCategory(int categoryId) {
        return categoryRepository.getCategory(categoryId);
    }
}
