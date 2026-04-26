package tr.com.huseyinaydin.dto.productdetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductDetailByIdDto {
    private Integer productDetailID;
    private Integer productSize;
    private Integer bedroomCount;
    private Integer bathCount;
    private Integer roomCount;
    private Integer garageSize;
    private String buildYear;
    private BigDecimal price;
    private String location;
    private String videoUrl;
    private Integer productID;
}
