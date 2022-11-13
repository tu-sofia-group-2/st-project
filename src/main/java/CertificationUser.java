public class CertificationUser {
    private Long ID;
    private Course course;
    private User user;
    private CertificationEnum type;
    private boolean taken;
    public CertificationUser(Long ID, Course course, User user, CertificationEnum type, boolean taken) {
        this.ID = ID;
        this.course = course;
        this.user = user;
        this.type = type;
        this.taken = taken;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CertificationEnum getType() {
        return type;
    }

    public void setType(CertificationEnum type) {
        this.type = type;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
