package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Message;

public interface MessageDao extends JpaRepository<Message, Long> {
    public Message getById(Long id);
}
