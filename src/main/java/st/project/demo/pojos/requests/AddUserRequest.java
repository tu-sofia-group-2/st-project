package st.project.demo.pojos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUserRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String password;
    private Long facultyID;
    private Boolean gender;
    private String roleName;
}
