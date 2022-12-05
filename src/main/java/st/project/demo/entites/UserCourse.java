package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CourseRoleEnum;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class UserCourse {
    private User user;
    private Course course;
    private CourseRoleEnum courseRoleEnum;
    private int year;
    private List<CertificationUser> certifications;
}
