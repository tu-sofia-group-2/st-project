package EntityPackage;

import java.util.List;

public class Faculty {
    private Long ID;
    private String name;
    private String description;
    private List<Contact> contacts;
    public Faculty(Long ID, String name, String description, List<Contact> contacts) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.contacts = contacts;
    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
