package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private User postedBy;
    private String body;
    private Date postedOn;
}
