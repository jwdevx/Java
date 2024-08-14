import java.util.HashMap;
import java.util.Map;
import Java.main.Entity;

public class EntityMap<T extends Entity> {
    // Use HashMap for efficient lookup by ID
    private Map<Object, T> entities = new HashMap<>();

    /**
     * @param id - most probably a String id
     * @return - the object or null if id is not found
     */
    public T findEntityById(Object id) {
        // Directly access the entity using the ID as the key
        return entities.get(id);
    }

    public void addEntity(T entity) {
        // Add the entity to the HashMap with its ID as the key
        entities.put(entity.getId(), entity);
    }
}
