package st.project.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.ContactTypeEnum;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private ContactTypeEnum type;
    private String body;
    @ManyToOne
    private User user;
}
