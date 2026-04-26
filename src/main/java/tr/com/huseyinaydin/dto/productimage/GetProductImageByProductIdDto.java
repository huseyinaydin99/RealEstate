package tr.com.huseyinaydin.dto.productimage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductImageByProductIdDto {
    private int productImageId;
    private String imageUrl;
    private int productId;
}
