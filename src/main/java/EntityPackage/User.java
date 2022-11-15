package EntityPackage;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 20)
    private String middleName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @Column(nullable = false, length = 20)
    private Long facultyID;

    @Column(nullable = false)
    private Boolean gender;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserProgramme> programmes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Contact> contacts;

    @Column(nullable = false)
    private Role role;

    protected User() {}
    public User(String firstName, String middleName, String lastName, Long facultyID, Boolean gender, List<UserProgramme> programmes, List<Contact> contacts, Role role) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.facultyID = facultyID;
        this.gender = gender;
        this.programmes = programmes;
        this.contacts = contacts;
        this.role = role;
    }

    public Long getUserID() {
        return this.ID;
    }

    public Long getFacultyID() {
        return this.facultyID;
    }

    public void setFacultyID(Long ID) {
        this.facultyID = ID;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String newName) {
        this.middleName = newName;
    }

    public String getLastName() {
        return this.lastName;
    }

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
