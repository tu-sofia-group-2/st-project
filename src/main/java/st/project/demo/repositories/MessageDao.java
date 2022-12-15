package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Message;
@Repository

public interface MessageDao extends JpaRepository<Message, Long> {
    public Message getById(Long id);
}
