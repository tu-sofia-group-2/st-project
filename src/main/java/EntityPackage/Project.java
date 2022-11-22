package EntityPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class Project {
    private Long ID;
    private Course course;
    private List<UserProject> users;
}
