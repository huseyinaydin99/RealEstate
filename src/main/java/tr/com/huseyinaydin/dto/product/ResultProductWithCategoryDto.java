package tr.com.huseyinaydin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultProductWithCategoryDto {
    private int productID;
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private String categoryName;
    private String coverImage;
    private String type;
    private String address;
    private boolean dealOfTheDay;
    private boolean productStatus;
    private String slugUrl;
}
