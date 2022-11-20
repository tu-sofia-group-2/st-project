package EntityPackage;

import EnumPackage.ContactTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Contact {
    private long ID;
    private ContactTypeEnum type;
    private String body;
}
