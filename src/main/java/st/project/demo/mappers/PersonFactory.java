package st.project.demo.mappers;

import org.springframework.stereotype.Component;

import st.project.demo.beans.PersonBean;
import st.project.demo.entites.Person;

public interface PersonFactory {
	public PersonBean toPersonBean(Person perso);
}
