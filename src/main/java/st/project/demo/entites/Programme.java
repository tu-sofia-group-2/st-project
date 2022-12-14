package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.DegreeEnum;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class Programme {
    private Long id;
    private String name;
    private String description;
    private int semester;
    private Faculty faculty;
    private DegreeEnum degree;
    private int duration;
    private Programme extensionOf;
    private List<UserProgramme> userProgrammes;
    private List<Course> courses;
}
