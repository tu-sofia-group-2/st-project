package st.project.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserProject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Project project;
    private User user;
}
