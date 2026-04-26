package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.bottomgrid.CreateBottomGridDto;
import tr.com.huseyinaydin.dto.bottomgrid.ResultBottomGridDto;

import java.util.List;

public interface BottomGridService {
    List<ResultBottomGridDto> getAllBottomGrid();
    void createBottomGrid(CreateBottomGridDto createBottomGridDto);
    void deleteBottomGrid(int id);
    ResultBottomGridDto getBottomGrid(int id);
}
