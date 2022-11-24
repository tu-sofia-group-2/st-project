package EntityPackage;

import EnumPackage.DegreeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class Programme {
    private Long ID;
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
