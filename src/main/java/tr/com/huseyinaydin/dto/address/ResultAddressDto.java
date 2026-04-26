package tr.com.huseyinaydin.dto.address;

import lombok.Data;

@Data
public class ResultAddressDto {
    private int addressID;
    private String addressTitle1;
    private String description;
    private String addressTitle2;
    private String phone1;
    private String phone2;
    private String email;
    private String location;
}
