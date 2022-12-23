package st.project.demo.entites;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import st.project.demo.constants.ContactTypeEnum;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private ContactTypeEnum type;
    private String body;
    @ManyToOne
    private Person user;
    @ManyToOne
    private Faculty faculty;
}
