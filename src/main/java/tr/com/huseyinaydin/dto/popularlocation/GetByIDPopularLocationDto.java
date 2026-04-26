package tr.com.huseyinaydin.dto.popularlocation;

import lombok.Data;

@Data
public class GetByIDPopularLocationDto {
    private int locationID;
    private String cityName;
    private String imageUrl;
    private int propertyCount;
}
