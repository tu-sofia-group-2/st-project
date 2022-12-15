package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import st.project.demo.entites.CertificationUser;
import st.project.demo.entites.Contact;
import st.project.demo.repositories.ContactDao;

import java.util.List;
@Service
public class ContactService {
    private final ContactDao contactDao;


    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public Contact getContact(Long id) {
        return contactDao.getById(id);
    }
}
