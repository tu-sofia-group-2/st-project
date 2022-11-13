package EntityPackage;

import EnumPackage.DegreeEnum;

import java.util.List;

public class Programme {
    private Long ID;
    private String name;
    private String description;
    private int semester;
    private Faculty faculty;
    private DegreeEnum degree;
    private int duration;
    private Programme extensionOf;
    private List<UserProgramme> userProgrammes;
    private List<Course> courses;
    public Programme(Long ID, String name, String description, int semester, Faculty faculty, DegreeEnum degree, int duration, Programme extensionOf, List<UserProgramme> userProgrammes, List<Course> courses) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.semester = semester;
        this.faculty = faculty;
        this.degree = degree;
        this.duration = duration;
        this.extensionOf = extensionOf;
        this.userProgrammes = userProgrammes;
        this.courses = courses;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public DegreeEnum getDegree() {
        return degree;
    }

    public void setDegree(DegreeEnum degree) {
        this.degree = degree;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Programme getExtensionOf() {
        return extensionOf;
    }

    public void setExtensionOf(Programme extensionOf) {
        this.extensionOf = extensionOf;
    }

    public List<UserProgramme> getUserProgrammes() {
        return userProgrammes;
    }

    public void setUserProgrammes(List<UserProgramme> userProgrammes) {
        this.userProgrammes = userProgrammes;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
