package st.project.demo.entites;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserProject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Person user;
}
