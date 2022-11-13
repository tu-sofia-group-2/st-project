package EntityPackage;

public class UserProject {
    private Long ID;
    private Project project;
    private User user;

    public UserProject(Long ID, Project project, User user) {
        this.ID = ID;
        this.project = project;
        this.user = user;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
