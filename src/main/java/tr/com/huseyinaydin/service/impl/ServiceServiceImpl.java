package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;
import tr.com.huseyinaydin.repository.ServiceRepository;
import tr.com.huseyinaydin.service.ServiceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    public List<ResultServiceDto> getAllService() {
        return serviceRepository.getAllService();
    }
}
