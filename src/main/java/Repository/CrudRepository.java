package Repository;

import org.springframework.data.repository.Repository;
import java.util.Optional;

public interface CrudRepository<T, ID> extends Repository<T, ID> {

    T save(T entity);
    T findById(ID primaryKey);
    Iterable<T> findAll();
    long count();
    void delete(T entity);
    boolean existsById(ID primaryKey);
}