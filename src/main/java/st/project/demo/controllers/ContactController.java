package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Contact;
import st.project.demo.services.ContactService;

@RestController
@RequestMapping("/api/v1/certifivationuser")
public class ContactController {

    private final ContactService contactService;


    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/api/v1/certificationuser/get/{id}")
    public Contact getCertificationUser(@PathVariable Long id){return contactService.getContact(id);}
}
