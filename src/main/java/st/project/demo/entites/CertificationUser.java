package st.project.demo.entites;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CertificationUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Person user;
    private CertificationEnum type;
    private boolean taken;
}
