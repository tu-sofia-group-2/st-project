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
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    @ElementCollection
    private List<String> permissions;
    @OneToMany(mappedBy = "role")
    private List<User> users;
}
