package tr.com.huseyinaydin.dto.contact;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ResultContactDto {
    private int contactID;
    private String name;
    private String subject;
    private String email;
    private String message;
    private LocalDateTime sendDate;
}
