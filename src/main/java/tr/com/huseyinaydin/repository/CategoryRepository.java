package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.category.CreateCategoryDto;
import tr.com.huseyinaydin.dto.category.ResultCategoryDto;
import tr.com.huseyinaydin.dto.category.UpdateCategoryDto;

import java.util.List;

@Mapper
public interface CategoryRepository {
    List<ResultCategoryDto> getAllCategory();
    void createCategory(CreateCategoryDto createCategoryDto);
    void deleteCategory(int id);
    void updateCategory(UpdateCategoryDto updateCategoryDto);
    ResultCategoryDto getCategory(int id);
}
