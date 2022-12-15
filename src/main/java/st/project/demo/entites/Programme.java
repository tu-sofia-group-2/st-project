package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.DegreeEnum;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Programme {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int semester;
    @ManyToOne
    private Faculty faculty;
    private DegreeEnum degree;
    private int duration;
    @OneToMany(mappedBy="programme", cascade=CascadeType.ALL)
    private List<UserProgramme> userProgrammes;
    @OneToMany(mappedBy="programme", cascade=CascadeType.ALL)
    private List<Course> courses;
}
