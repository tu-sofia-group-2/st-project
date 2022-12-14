package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CourseRoleEnum;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private User user;
    private Course course;
    private CourseRoleEnum courseRoleEnum;
    private int year;
    @OneToMany(cascade=CascadeType.ALL)
    private List<CertificationUser> certifications;
}
