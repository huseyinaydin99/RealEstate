package tr.com.huseyinaydin.service.impl;

import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.todolist.ResultToDoListDto;
import tr.com.huseyinaydin.repository.ToDoListRepository;
import tr.com.huseyinaydin.service.ToDoListService;
import java.util.List;

@Service
public class ToDoListServiceImpl implements ToDoListService {

    private final ToDoListRepository toDoListRepository;

    public ToDoListServiceImpl(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @Override
    public List<ResultToDoListDto> getAllToDoList() {
        return toDoListRepository.getAllToDoList();
    }

    @Override
    public void createToDoList(String description) {
        toDoListRepository.createToDoList(description);
    }

    @Override
    public void deleteToDoList(int id) {
        toDoListRepository.deleteToDoList(id);
    }

    @Override
    public void toDoListStatusChangeToTrue(int id) {
        toDoListRepository.toDoListStatusChangeToTrue(id);
    }

    @Override
    public void toDoListStatusChangeToFalse(int id) {
        toDoListRepository.toDoListStatusChangeToFalse(id);
    }
}
