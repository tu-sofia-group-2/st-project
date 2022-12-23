package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Person postedBy;
    private String body;
    private Date postedOn;
}
