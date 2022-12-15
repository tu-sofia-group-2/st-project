package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long facultyID;
    private Boolean gender;
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<UserProgramme> programmes;
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<Contact> contacts;
    @OneToMany
    private List<UserProject> projects;
    @ManyToOne
    private Role role;
}
