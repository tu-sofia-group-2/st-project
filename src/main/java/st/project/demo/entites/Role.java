package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Role {
    private Long ID;
    private String name;
    private List<String> permissions;
}
