package tr.com.huseyinaydin.dto.category;

import lombok.Data;

@Data
public class UpdateCategoryDto {
    private int categoryID;
    private String categoryName;
    private boolean categoryStatus;
}
