package st.project.demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class CertificationUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Course course;
    private User user;
    private CertificationEnum type;
    private boolean taken;
}
