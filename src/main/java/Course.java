import java.util.List;

public class Course {
    private Long ID;
    private Long courseID;
    private String name;
    private String description;
    private Programme programme;
    private int semester;
    private List<UserCourse> users;
    private List<Message> messages;
    private List<CertificationEnum> formOfControl;
    private Project project;

    public Course(Long ID, Long courseID, String name, String description, Programme programme, int semester, List<UserCourse> users, List<Message> messages, List<CertificationEnum> formOfControl, Project project) {
        this.ID = ID;
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.programme = programme;
        this.semester = semester;
        this.users = users;
        this.messages = messages;
        this.formOfControl = formOfControl;
        this.project = project;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<UserCourse> getUsers() {
        return users;
    }

    public void setUsers(List<UserCourse> users) {
        this.users = users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<CertificationEnum> getFormOfControl() {
        return formOfControl;
    }

    public void setFormOfControl(List<CertificationEnum> formOfControl) {
        this.formOfControl = formOfControl;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
