package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.propertyamenity.ResultPropertyAmenityByStatusTrueDto;

import java.util.List;

public interface PropertyAmenityService {
    List<ResultPropertyAmenityByStatusTrueDto> getPropertyAmenityByStatusTrue(int id);
}
