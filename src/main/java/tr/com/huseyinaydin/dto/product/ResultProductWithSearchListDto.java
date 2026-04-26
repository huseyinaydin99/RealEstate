package tr.com.huseyinaydin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultProductWithSearchListDto {
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
}
