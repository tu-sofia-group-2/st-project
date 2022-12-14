package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.DegreeEnum;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private Faculty faculty;
    private DegreeEnum degree;
    private int duration;
    private Programme extensionOf;
    @OneToMany(mappedBy="programme", cascade=CascadeType.ALL)
    private List<UserProgramme> userProgrammes;
    @OneToMany(mappedBy="course", cascade=CascadeType.ALL)
    private List<Course> courses;
}
