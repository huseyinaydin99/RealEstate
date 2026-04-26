package tr.com.huseyinaydin.dto.message;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CreateMessageDto {
    private Integer sender;
    private Integer receiver;
    private String receiverEmail;
    private String subject;
    private String detail;
    private LocalDateTime sendDate;
    private Boolean isRead;
}
