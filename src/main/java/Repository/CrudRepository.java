package Repository;

import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public interface CrudRepository<T, ID> extends Repository<T, ID> {
}