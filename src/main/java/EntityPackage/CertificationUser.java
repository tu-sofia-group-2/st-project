package EntityPackage;

import EnumPackage.CertificationEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
