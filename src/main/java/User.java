import java.util.List;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private Long ID;
    private Long facultyID;

    private Boolean gender;

    private List<UserProgramme> programmes;

    private List<Contact> contacts;

    private Role role;

    // Getter
    public Long getUserID() {
        return this.ID;
    }

    // Setter
    public void setUserID(Long ID) {
        this.ID = ID;
    }

    // Getter
    public Long getFacultyID() {
        return this.facultyID;
    }

    // Setter
    public void setFacultyID(Long ID) {
        this.facultyID = ID;
    }
    // Getter
    public String getFirstName() {
        return this.firstName;
    }

    // Setter
    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    // Getter
    public String getMiddleName() {
        return this.middleName;
    }

    // Setter
    public void setMiddleName(String newName) {
        this.middleName = newName;
    }

    // Getter
    public String getLastName() {
        return this.lastName;
    }

    // Setter
    public void setLastName(String newName) {
        this.lastName = newName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public List<UserProgramme> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(List<UserProgramme> programmes) {
        this.programmes = programmes;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
