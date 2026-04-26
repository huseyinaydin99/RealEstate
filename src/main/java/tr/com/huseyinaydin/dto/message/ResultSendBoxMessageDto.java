package tr.com.huseyinaydin.dto.message;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ResultSendBoxMessageDto {
    private Integer messageID;
    private String name;
    private String subject;
    private String detail;
    private LocalDateTime sendDate;
    private Boolean isRead;
    private String userImageUrl;
}
