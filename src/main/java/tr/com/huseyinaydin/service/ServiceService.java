package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.service.CreateServiceDto;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;

import java.util.List;

public interface ServiceService {
    List<ResultServiceDto> getAllService();
    void createService(CreateServiceDto createServiceDto);
    void deleteService(int id);
}
