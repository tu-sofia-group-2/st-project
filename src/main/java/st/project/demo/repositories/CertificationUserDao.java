package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.CertificationUser;

import java.util.Optional;

public interface CertificationUserDao extends JpaRepository<CertificationUser, Long> {
    public CertificationUser getById(Long id);
}
