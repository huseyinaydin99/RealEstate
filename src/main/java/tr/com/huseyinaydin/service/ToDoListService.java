package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.todolist.ResultToDoListDto;
import java.util.List;

public interface ToDoListService {
    List<ResultToDoListDto> getAllToDoList();
    void createToDoList(String description);
    void deleteToDoList(int id);
    void toDoListStatusChangeToTrue(int id);
    void toDoListStatusChangeToFalse(int id);
}
