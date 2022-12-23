package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import st.project.demo.constants.UserProgrammeStateEnum;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserProgramme {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Person user;
    @ManyToOne
    private Programme programme;
    private UserProgrammeStateEnum state;
    private Boolean minor;
    private YearSemesterTouple startedOn;
    private Integer startedFrom;
}

