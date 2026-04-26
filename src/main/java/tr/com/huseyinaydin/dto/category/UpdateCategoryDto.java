package tr.com.huseyinaydin.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCategoryDto {
    private int categoryID;
    private String categoryName;
    private boolean categoryStatus;
}
