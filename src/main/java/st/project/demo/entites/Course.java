package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Course {
    private Long id;
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
