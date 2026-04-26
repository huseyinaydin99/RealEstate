package tr.com.huseyinaydin.dto.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultServiceDto {
    private int serviceID;
    private String serviceName;
    private boolean serviceStatus;
}
