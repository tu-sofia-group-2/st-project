package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long courseId;
    private String name;
    private String description;
    @ManyToOne
    private Programme programme;
    private int semester;
    @OneToMany(mappedBy="course", cascade=CascadeType.ALL)
    private List<UserCourse> users;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Message> messages;
    @ElementCollection
    private List<CertificationEnum> formOfControl;
    @OneToMany(mappedBy="course")
    private List<Project> project;
}
