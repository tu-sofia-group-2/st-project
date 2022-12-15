package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import st.project.demo.constants.UserProgrammeStateEnum;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserProgramme {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Programme programme;
    private UserProgrammeStateEnum state;
    private Boolean minor;
    private YearSemesterTouple startedOn;
    private Integer startedFrom;
}

