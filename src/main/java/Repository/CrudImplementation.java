package Repository;

import java.util.ArrayList;
import java.util.List;

public class CrudImplementation<T> implements CrudRepository {
    List<T> objectsOfRepository = new ArrayList<T>();

    public CrudImplementation(List<T> objectsOfRepository) {
        this.objectsOfRepository = objectsOfRepository;
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Object findById(Object primaryKey) {
        return null;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public boolean existsById(Object primaryKey) {
        return false;
    }
}
