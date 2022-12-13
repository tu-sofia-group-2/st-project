package st.project.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Contact;

import java.util.Optional;

public interface ContactDao extends JpaRepository<Contact, Long> {
    public Contact getById(Long id);

}
