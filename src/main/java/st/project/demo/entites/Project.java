package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@ManyToOne()
    private Course course;
	@OneToMany(mappedBy="project")
    private List<UserProject> users;
}
