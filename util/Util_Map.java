package Java.util;

import Java.main.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Util_Map<T extends Entity> {

    // Use HashMap for efficient lookup by ID
    private Map<Object, T> entities = new HashMap<>();

    /**
     * Adds an entity to the map with its ID as the key.
     * @param id - the ID of the entity
     * @param entity - the entity to add
     */
    public void addEntity(Object id, T entity) {
        entities.put(id, entity);
    }

    /**
     * Adds all entities from another map to this map.
     * @param otherEntities - the map of entities to add
     */
    public void addAllEntities(Map<Object, T> otherEntities) {
        entities.putAll(otherEntities);
    }

    // =========================================================================
    /**
     * Finds an entity by its ID.
     * @param id - the ID of the entity to find
     * @return - the entity if found, or null if not found
     */
    public T getEntityById(Object id) {
        return entities.get(id);
    }

    // =========================================================================
    /**
     * Checks if the map contains a specific entity by ID.
     * @param id - the ID of the entity to check
     * @return - true if the map contains the entity, false otherwise
     */
    public boolean containsEntity(Object id) {
        return entities.containsKey(id);
    }

    /**
     * Prints all entities in the map.
     */
    public void printEntities() {
        entities.values().forEach(entity -> System.out.println(entity));
    }

    // =========================================================================
    /**
     * Gets the size of the map.
     * @return - the number of entities in the map
     */
    public int size() {
        return entities.size();
    }

    /**
     * Checks if the map is empty.
     * @return - true if the map is empty, otherwise false
     */
    public boolean isEmpty() {
        return entities.isEmpty();
    }

    // =========================================================================
    /**
     * Converts the map of entities to an array.
     * @return - an array containing all entities in the map
     */
    public Object[] toArray() {
        return entities.values().toArray();
    }

    // =========================================================================
    /**
     * Removes an entity from the map by its ID.
     * @param id - the ID of the entity to remove
     * @return - the removed entity, or throws an exception if not found
     * @throws NoSuchElementException if the entity is not found in the map
     */
    public T removeEntity(Object id) {
        T entity = entities.remove(id);
        if (entity == null) {
            throw new NoSuchElementException("Entity not found with ID: " + id);
        }
        return entity;
    }

    /**
     * Clears all entities from the map.
     */
    public void clear() {
        entities.clear();
    }
}
