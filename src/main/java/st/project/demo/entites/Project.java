package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Project {
	@Id
    private Long id;
    private Course course;
    private List<UserProject> users;
}
