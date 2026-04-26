package tr.com.huseyinaydin.dto.product;

import lombok.Data;
import java.math.BigDecimal;

@Data
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
