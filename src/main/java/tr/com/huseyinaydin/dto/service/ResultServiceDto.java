package tr.com.huseyinaydin.dto.service;

import lombok.Data;

@Data
public class ResultServiceDto {
    private int serviceID;
    private String serviceName;
    private boolean serviceStatus;
}
