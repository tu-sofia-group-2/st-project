package st.project.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(indexes = {@Index(name = "UID_person_course", columnList = "course_id,person_id", unique = true)})
public class CourseFeedback {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    private Date date;
    private String description;

    public CourseFeedback(Person person, Course course, String description){
        this.person = person;
        this.course = course;
        this.description = description;
        this.date = new Date();
    }
}
