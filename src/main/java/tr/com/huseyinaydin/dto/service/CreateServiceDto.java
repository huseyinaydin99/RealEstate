package tr.com.huseyinaydin.dto.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateServiceDto {
    private String serviceName;
    private boolean serviceStatus;
}
