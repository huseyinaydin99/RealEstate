package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.popularlocation.ResultPopularLocationDto;
import java.util.List;

@Mapper
public interface PopularLocationRepository {
    List<ResultPopularLocationDto> getAllPopularLocation();
}
