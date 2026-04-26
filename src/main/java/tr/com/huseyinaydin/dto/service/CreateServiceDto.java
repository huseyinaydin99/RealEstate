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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(boolean serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
