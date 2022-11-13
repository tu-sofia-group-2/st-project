public class UserProgramme {
    private Long ID;
    private User user;
    private Programme programme;
    private UserProgrammeStateEnum state;
    private int semester;
    private Boolean minor;
    private YearSemesterTouple startedOn;
    private int startedFrom;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public UserProgrammeStateEnum getState() {
        return state;
    }

    public void setState(UserProgrammeStateEnum state) {
        this.state = state;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Boolean getMinor() {
        return minor;
    }

    public void setMinor(Boolean minor) {
        this.minor = minor;
    }

    public YearSemesterTouple getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(YearSemesterTouple startedOn) {
        this.startedOn = startedOn;
    }

    public int getStartedFrom() {
        return startedFrom;
    }

    public void setStartedFrom(int startedFrom) {
        this.startedFrom = startedFrom;
    }
}
