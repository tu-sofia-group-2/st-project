package st.project.demo.entites;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class YearSemesterTouple {
    private int year;
    private int semester;
}
