package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.subfeature.ResultSubFeatureDto;
import java.util.List;

@Mapper
public interface SubFeatureRepository {
    List<ResultSubFeatureDto> getAllSubFeature();
}
