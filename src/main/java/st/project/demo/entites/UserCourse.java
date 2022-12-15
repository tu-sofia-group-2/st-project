package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CourseRoleEnum;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Course course;
    private CourseRoleEnum courseRoleEnum;
    private int year;
    @OneToMany(cascade=CascadeType.ALL)
    private List<CertificationUser> certifications;
}
