package tr.com.huseyinaydin.dto.product;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ResultProductDto {
    private int productID;
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private int productCategory;
}
