package EntityPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long ID;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long facultyID;
    private Boolean gender;
    private List<UserProgramme> programmes;
    private List<Contact> contacts;
    private Role role;
}
