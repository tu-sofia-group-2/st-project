package EntityPackage;

import EnumPackage.ContactTypeEnum;

public class Contact {
    private long ID;
    private ContactTypeEnum type;
    private String body;

    public Contact(long ID, ContactTypeEnum type, String body) {
        this.ID = ID;
        this.type = type;
        this.body = body;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public ContactTypeEnum getType() {
        return type;
    }

    public void setType(ContactTypeEnum type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
