package EntityPackage;

import EnumPackage.CourseRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
