package guru.springframework.sfgpetclinic.model;
import java.io.Serializable;

/**
 * Created by jt on 7/18/18.
 */

public class BaseEntity implements Serializable {

    private Long id;

    public boolean isNew() {
        return this.id == null;
    }

}
