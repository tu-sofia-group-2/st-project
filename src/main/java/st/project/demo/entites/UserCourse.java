package st.project.demo.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import st.project.demo.constants.CourseRoleEnum;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Person user;
    @ManyToOne
    @JsonIgnore
    private Course course;
    @Enumerated(EnumType.STRING)
    private CourseRoleEnum courseRoleEnum;
    private int year;
    @OneToMany(cascade=CascadeType.ALL)
    private List<CertificationUser> certifications;
}
