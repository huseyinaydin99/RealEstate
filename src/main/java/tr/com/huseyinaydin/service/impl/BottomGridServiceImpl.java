package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.bottomgrid.CreateBottomGridDto;
import tr.com.huseyinaydin.dto.bottomgrid.ResultBottomGridDto;
import tr.com.huseyinaydin.repository.BottomGridRepository;
import tr.com.huseyinaydin.service.BottomGridService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BottomGridServiceImpl implements BottomGridService {
    private final BottomGridRepository bottomGridRepository;

    @Override
    public List<ResultBottomGridDto> getAllBottomGrid() {
        return bottomGridRepository.getAllBottomGrid();
    }

    @Override
    public void createBottomGrid(CreateBottomGridDto createBottomGridDto) {
        bottomGridRepository.createBottomGrid(createBottomGridDto);
    }

    @Override
    public void deleteBottomGrid(int id) {
        bottomGridRepository.deleteBottomGrid(id);
    }

    @Override
    public ResultBottomGridDto getBottomGrid(int id) {
        return bottomGridRepository.getBottomGrid(id);
    }
}
