package st.project.demo.endpoints.beans;

import java.util.List;

import EntityPackage.Contact;
import EntityPackage.Role;
import lombok.Data;

@Data
public class UserInputBean {
    private Long ID;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long facultyID;
    private Boolean gender;
    private List<Contact> contacts;
}
