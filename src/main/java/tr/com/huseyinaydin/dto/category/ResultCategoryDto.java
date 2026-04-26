package tr.com.huseyinaydin.dto.category;

import lombok.Data;

@Data
public class ResultCategoryDto {
    private int categoryID;
    private String categoryName;
    private boolean categoryStatus;
}
