package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.UserProgrammeStateEnum;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor

public class UserProgramme {
    private Long id;
    private User user;
    private Programme programme;
    private UserProgrammeStateEnum state;
    private int semester;
    private Boolean minor;
    private YearSemesterTouple startedOn;
    private int startedFrom;
}

