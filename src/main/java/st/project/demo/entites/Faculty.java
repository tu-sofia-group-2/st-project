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
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "faculty")
    private List<Contact> contacts;
    @OneToMany(mappedBy = "faculty")
    private List<Programme> programmes;
}
