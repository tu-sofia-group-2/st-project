package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UserProject {
    private Long ID;
    private Project project;
    private User user;
}
