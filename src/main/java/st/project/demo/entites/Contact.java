package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.ContactTypeEnum;

@Getter
@Setter
@AllArgsConstructor

public class Contact {
    private long id;
    private ContactTypeEnum type;
    private String body;
}
