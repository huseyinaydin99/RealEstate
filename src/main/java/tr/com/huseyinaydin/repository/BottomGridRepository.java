package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.bottomgrid.CreateBottomGridDto;
import tr.com.huseyinaydin.dto.bottomgrid.ResultBottomGridDto;
import java.util.List;

@Mapper
public interface BottomGridRepository {
    List<ResultBottomGridDto> getAllBottomGrid();
    void createBottomGrid(CreateBottomGridDto createBottomGridDto);
    void deleteBottomGrid(int id);
    ResultBottomGridDto getBottomGrid(int id);
}
