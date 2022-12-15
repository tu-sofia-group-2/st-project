package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.CertificationUser;

import java.util.Optional;
@Repository
public interface CertificationUserDao extends JpaRepository<CertificationUser, Long> {
    public CertificationUser getById(Long id);
}
