package EntityPackage;

import EnumPackage.UserProgrammeStateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor

public class UserProgramme {
    private Long ID;
    private User user;
    private Programme programme;
    private UserProgrammeStateEnum state;
    private int semester;
    private Boolean minor;
    private YearSemesterTouple startedOn;
    private int startedFrom;
}

