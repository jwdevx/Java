package Java.util;
// Published on Github - Public

import java.util.List;
import Java.main.Entity;
import java.util.ArrayList;

public class EntityList<T extends Entity> {
    private List<T> entities = new ArrayList<>();

    /**
     * @param id - most probably a String id
     * @return - the object or null if id is not found
     */
    public T findEntityById(Object id) {
        /*
        for (T entity : entities) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
         */

        return entities.stream()
                       .filter(p -> p.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    public void addEntity(T entity) {
        entities.add(entity);
    }
}
