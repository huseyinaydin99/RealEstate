package tr.com.huseyinaydin.dto.productimage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultProductImageDto {
    private int productImageId;
    private String imageUrl;
    private String title;
    private String city;
    private int productId;
}
