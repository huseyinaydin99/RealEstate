package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.business.rules.ServiceBusinessRules;
import tr.com.huseyinaydin.dto.service.CreateServiceDto;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;
import tr.com.huseyinaydin.repository.ServiceRepository;
import tr.com.huseyinaydin.service.ServiceService;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    private final ServiceRepository serviceRepository;

    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<ResultServiceDto> getAllService() {
        return serviceRepository.getAllService();
    }

    @Override
    public void createService(CreateServiceDto createServiceDto) {
        ServiceBusinessRules.checkIfServiceNameIsNull(createServiceDto.getServiceName());
        serviceRepository.createService(createServiceDto);
    }

    @Override
    public void deleteService(int id) {
        serviceRepository.deleteService(id);
    }
}
