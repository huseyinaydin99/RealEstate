package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.whowearedetail.ResultWhoWeAreDetailDto;

import java.util.List;

@Mapper
public interface WhoWeAreDetailRepository {
    List<ResultWhoWeAreDetailDto> getAllWhoWeAreDetail();
}
