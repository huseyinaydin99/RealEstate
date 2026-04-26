package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.propertyamenity.ResultPropertyAmenityByStatusTrueDto;
import tr.com.huseyinaydin.repository.PropertyAmenityRepository;
import tr.com.huseyinaydin.service.PropertyAmenityService;

import java.util.List;

@Service
public class PropertyAmenityServiceImpl implements PropertyAmenityService {
    private final PropertyAmenityRepository propertyAmenityRepository;

    public PropertyAmenityServiceImpl(PropertyAmenityRepository propertyAmenityRepository) {
        this.propertyAmenityRepository = propertyAmenityRepository;
    }

    @Override
    public List<ResultPropertyAmenityByStatusTrueDto> getPropertyAmenityByStatusTrue(int id) {
        return propertyAmenityRepository.getPropertyAmenityByStatusTrue(id);
    }
}
