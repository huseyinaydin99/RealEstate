package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.propertyamenity.ResultPropertyAmenityByStatusTrueDto;
import java.util.List;

@Mapper
public interface PropertyAmenityRepository {
    List<ResultPropertyAmenityByStatusTrueDto> getPropertyAmenityByStatusTrue(int id);
}
