package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.CertificationEnum;

@Getter
@Setter
@AllArgsConstructor

public class CertificationUser {
    private Long ID;
    private Course course;
    private User user;
    private CertificationEnum type;
    private boolean taken;
}
