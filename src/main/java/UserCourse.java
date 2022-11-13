import java.util.List;

public class UserCourse {
    private User user;
    private Course course;
    private CourseRoleEnum courseRoleEnum;
    private int year;
    private List<CertificationUser> certifications;

    public UserCourse(User user, Course course, CourseRoleEnum courseRoleEnum, int year, List<CertificationUser> certifications) {
        this.user = user;
        this.course = course;
        this.courseRoleEnum = courseRoleEnum;
        this.year = year;
        this.certifications = certifications;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public CourseRoleEnum getCourseRoleEnum() {
        return courseRoleEnum;
    }

    public void setCourseRoleEnum(CourseRoleEnum courseRoleEnum) {
        this.courseRoleEnum = courseRoleEnum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<CertificationUser> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<CertificationUser> certifications) {
        this.certifications = certifications;
    }
}
