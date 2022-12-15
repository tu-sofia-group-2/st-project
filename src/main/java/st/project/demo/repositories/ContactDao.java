package st.project.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Contact;

import java.util.Optional;
@Repository
public interface ContactDao extends JpaRepository<Contact, Long> {
    public Contact getById(Long id);

}
