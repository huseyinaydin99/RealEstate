package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.popularlocation.CreatePopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.GetByIDPopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.ResultPopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.UpdatePopularLocationDto;

import java.util.List;

public interface PopularLocationService {
    List<ResultPopularLocationDto> getAllPopularLocations();
    void createPopularLocation(CreatePopularLocationDto createPopularLocationDto);
    void deletePopularLocation(int id);
    void updatePopularLocation(UpdatePopularLocationDto updatePopularLocationDto);
    GetByIDPopularLocationDto getPopularLocationById(int id);
}
