package tr.com.huseyinaydin.dto.todolist;

import lombok.Data;

@Data
public class ResultToDoListDto {
    private int toDoListID;
    private String description;
    private boolean toDoListStatus;
}
