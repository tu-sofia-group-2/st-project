package st.project.demo.beans;

import lombok.Data;

@Data
public class PersonBean {
	private Long id;
	private Long facultyId;
	private String username;
	private String firstName;
	private String middleName;
	private String lastName;
	private Boolean gender;
	private RoleBean role;
}
