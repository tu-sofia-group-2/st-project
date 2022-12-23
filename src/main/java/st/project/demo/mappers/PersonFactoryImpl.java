package st.project.demo.mappers;

import org.springframework.stereotype.Component;

import st.project.demo.beans.PersonBean;
import st.project.demo.entites.Person;

@Component
public class PersonFactoryImpl implements PersonFactory {

	@Override
	public PersonBean toPersonBean(Person perso) {
		PersonBean bean = new PersonBean();
		bean.setFacultyId(perso.getFacultyID());
		bean.setId(perso.getId());
		bean.setFirstName(perso.getFirstName());
		bean.setMiddleName(perso.getMiddleName());
		bean.setLastName(perso.getLastName());
		bean.setGender(perso.getGender());
		bean.setUsername(perso.getUsername());
		return bean;
	}

}
