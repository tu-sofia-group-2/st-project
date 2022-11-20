package EntityPackage;

import EnumPackage.CertificationEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Course {
    private Long ID;
    private Long courseID;
    private String name;
    private String description;
    private Programme programme;
    private int semester;
    private List<UserCourse> users;
    private List<Message> messages;
    private List<CertificationEnum> formOfControl;
    private Project project;
}
