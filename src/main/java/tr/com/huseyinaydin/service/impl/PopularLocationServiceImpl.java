package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.popularlocation.CreatePopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.GetByIDPopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.ResultPopularLocationDto;
import tr.com.huseyinaydin.dto.popularlocation.UpdatePopularLocationDto;
import tr.com.huseyinaydin.repository.PopularLocationRepository;
import tr.com.huseyinaydin.service.PopularLocationService;

import java.util.List;

@Service
@CacheConfig(cacheNames = "popularLocations")
public class PopularLocationServiceImpl implements PopularLocationService {
    private final PopularLocationRepository popularLocationRepository;

    public PopularLocationServiceImpl(PopularLocationRepository popularLocationRepository) {
        this.popularLocationRepository = popularLocationRepository;
    }

    @Override
    @Cacheable(key = "'allPopularLocations'")
    public List<ResultPopularLocationDto> getAllPopularLocations() {
        return popularLocationRepository.getAllPopularLocation();
    }

    @Override
    @CacheEvict(key = "'allPopularLocations'", allEntries = true)
    public void createPopularLocation(CreatePopularLocationDto createPopularLocationDto) {
        popularLocationRepository.createPopularLocation(createPopularLocationDto);
    }

    @Override
    @CacheEvict(key = "'allPopularLocations'", allEntries = true)
    public void deletePopularLocation(int id) {
        popularLocationRepository.deletePopularLocation(id);
    }

    @Override
    @CacheEvict(key = "'allPopularLocations'", allEntries = true)
    public void updatePopularLocation(UpdatePopularLocationDto updatePopularLocationDto) {
        popularLocationRepository.updatePopularLocation(updatePopularLocationDto);
    }

    @Override
    public GetByIDPopularLocationDto getPopularLocationById(int id) {
        return popularLocationRepository.getPopularLocationById(id);
    }
}
