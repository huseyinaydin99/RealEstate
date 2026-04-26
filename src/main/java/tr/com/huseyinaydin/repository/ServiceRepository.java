package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.service.CreateServiceDto;
import tr.com.huseyinaydin.dto.service.ResultServiceDto;

import java.util.List;

@Mapper
public interface ServiceRepository {
    List<ResultServiceDto> getAllService();
    void createService(CreateServiceDto createServiceDto);
    void deleteService(int id);
}
