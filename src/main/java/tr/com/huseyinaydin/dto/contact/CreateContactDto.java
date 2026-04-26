package tr.com.huseyinaydin.dto.contact;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CreateContactDto {
    private String name;
    private String subject;
    private String email;
    private String message;
    private LocalDateTime sendDate;
}
