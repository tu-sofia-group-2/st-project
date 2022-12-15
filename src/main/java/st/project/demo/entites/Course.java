package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long courseId;
    private String name;
    private String description;
    private Programme programme;
    private int semester;
    @OneToMany(mappedBy="course", cascade=CascadeType.ALL)
    private List<UserCourse> users;
    private List<Message> messages;
    private List<CertificationEnum> formOfControl;
    @OneToOne(mappedBy="project")
    private Project project;
}
