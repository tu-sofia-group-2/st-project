package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@OneToOne
    private Course course;
	@OneToMany(mappedBy="project")
    private List<UserProject> users;
}
