package tr.com.huseyinaydin.dto.product;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResultProductAdvertListWithCategoryByEmployeeDto {
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
