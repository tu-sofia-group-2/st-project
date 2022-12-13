package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor

public class Message {
    private Long id;
    private User postedBy;
    private String body;
    private Date postedOn;
}
