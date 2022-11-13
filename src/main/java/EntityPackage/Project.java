package EntityPackage;

import java.util.List;

public class Project {
    private Long ID;
    private Course course;
    private List<UserProject> users;

    public Project(Long ID, Course course, List<UserProject> users) {
        this.ID = ID;
        this.course = course;
        this.users = users;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<UserProject> getUsers() {
        return users;
    }

    public void setUsers(List<UserProject> users) {
        this.users = users;
    }
}
