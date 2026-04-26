package tr.com.huseyinaydin.dto.whowearedetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultWhoWeAreDetailDto {
    private int whoWeAreDetailId;
    private String title;
    private String subTitle;
    private String description1;
    private String description2;
}
