package EntityPackage;

import EnumPackage.UserProgrammeStateEnum;

import javax.persistence.*;

@Entity
@Table(name = "user_programmes")
public class UserProgramme {
    @Id
    @GeneratedValue
    private Long ID;

    @Column(nullable = false, name = "user")
    private User user;

    @Column(nullable = false, name = "programme")
    private Programme programme;

    @Column(nullable = false, name = "state")
    private UserProgrammeStateEnum state;

    @Column(name = "semester")
    private int semester;

    @Column(nullable = false, name = "minor")
    private Boolean minor;

    @Column(nullable = false, name = "startedOn")
    private YearSemesterTouple startedOn;
    private int startedFrom;

    protected UserProgramme() {}

    public UserProgramme(User user, Programme programme, UserProgrammeStateEnum state, int semester, Boolean minor, YearSemesterTouple startedOn, int startedFrom) {
        this.user = user;
        this.programme = programme;
        this.state = state;
        this.semester = semester;
        this.minor = minor;
        this.startedOn = startedOn;
        this.startedFrom = startedFrom;
    }

    public Long getID() {
        return ID;
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
