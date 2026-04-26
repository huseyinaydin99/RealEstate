package tr.com.huseyinaydin.dto.popularlocation;

import lombok.Data;

@Data
public class ResultPopularLocationDto {
    private int locationID;
    private String cityName;
    private String imageUrl;
}
