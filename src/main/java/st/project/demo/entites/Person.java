package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import st.project.demo.pojos.requests.AddUserRequest;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String password;
    private Long facultyID;
    private Boolean gender;
    @OneToMany
    private List<Message> messages;
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<UserProgramme> programmes;
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<Contact> contacts;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserProject> projects;
    @ManyToOne
    private Role role;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private  List<CourseFeedback> courseFeedbacks;

    public Person(AddUserRequest addUserRequest, Role role){
        this.firstName = addUserRequest.getFirstName();
        this.middleName = addUserRequest.getMiddleName();
        this.lastName = addUserRequest.getLastName();
        this.username = addUserRequest.getUsername();
        this.password = addUserRequest.getPassword(); // TODO - encryption? :)
        this.facultyID = addUserRequest.getFacultyID();
        this.gender = addUserRequest.getGender();
        this.role = role;
    }
}
