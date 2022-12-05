package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class Faculty {
    private Long ID;
    private String name;
    private String description;
    private List<Contact> contacts;
}
