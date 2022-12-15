package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Contact;
import st.project.demo.repositories.ContactDao;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactDao contactDao;
    public Contact getContact(Long id) {
        return contactDao.getById(id);
    }
}
