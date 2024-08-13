package Java.util;
// Published on Github - Public

import java.util.List;
import java.util.ArrayList;

public class EntityList<T extends Entity> {
    private List<T> entities = new ArrayList<>();

    public T findEntityById(Object id) {
        return entities.stream()
                       .filter(p -> p.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    public void addEntity(T entity) {
        entities.add(entity);
    }
}