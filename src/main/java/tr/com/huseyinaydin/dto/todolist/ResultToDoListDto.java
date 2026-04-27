package tr.com.huseyinaydin.dto.todolist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultToDoListDto {
    private int toDoListID;
    private String description;
    private boolean toDoListStatus;

    public boolean isToDoListStatus() {
        return toDoListStatus;
    }

    public boolean getToDoListStatus() {
        return toDoListStatus;
    }

    public void setToDoListStatus(boolean toDoListStatus) {
        this.toDoListStatus = toDoListStatus;
    }
}
