package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.todolist.ResultToDoListDto;
import java.util.List;

@Mapper
public interface ToDoListRepository {
    List<ResultToDoListDto> getAllToDoList();
    void createToDoList(String description);
    void deleteToDoList(int id);
    void toDoListStatusChangeToTrue(int id);
    void toDoListStatusChangeToFalse(int id);
}
