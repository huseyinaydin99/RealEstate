package tr.com.huseyinaydin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRole {
    private Integer roleId;
    private String roleName;
}
