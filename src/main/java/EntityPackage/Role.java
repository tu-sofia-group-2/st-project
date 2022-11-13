package EntityPackage;

import java.util.List;

public class Role {
    private Long ID;
    private String name;
    private List<String> permissions;
    public Role(Long ID, String name, List<String> permissions) {
        this.ID = ID;
        this.name = name;
        this.permissions = permissions;
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

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
