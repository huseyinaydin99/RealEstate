package tr.com.huseyinaydin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultProductDto {
    private int productID;
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private int productCategory;
}
