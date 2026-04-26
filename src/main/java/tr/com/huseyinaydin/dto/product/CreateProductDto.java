package tr.com.huseyinaydin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDto {
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private String coverImage;
    private String address;
    private String description;
    private String type;
    private boolean dealOfTheDay;
    private LocalDateTime advertisementDate;
    private boolean productStatus;
    private int productCategory;
    private int appUserId;
}
