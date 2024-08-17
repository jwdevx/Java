package Java.util;

// ! Github Public - common utility function for java.util.List;

import java.util.List;
import Java.main.Entity;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Util_List<T extends Entity> {
    private List<T> entities = new ArrayList<>();

    /**
     * Adds an entity to the list.
     * @param entity - the entity to add
     */
    public void addEntity(T entity) {
        entities.add(entity);
    }

    /**
     * Adds all entities from another list to this list.
     * @param otherEntities - the list of entities to add
     */
    public void addAllEntities(List<T> otherEntities) {
        entities.addAll(otherEntities);
    }

    // =========================================================================
    /**
     * Finds an entity by its ID.
     * @param id - the ID of the entity to find
     * @return - the entity if found, or null if not found
     */
    public T getEntityById(Object id) {
        return entities.stream()
                       .filter(entity -> entity.getId().equals(id))
                       .findFirst()
                       .orElse(null);
        /*
        for (T entity : entities) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
         */
    }

    /**
     * Retrieves an entity by its index in the list.
     * @param index - the index of the entity
     * @return - the entity at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T getEntityByIndex(int index) {
        return entities.get(index);
    }

    /**
     * Returns a sublist of entities between specified indices.
     * @param fromIndex - the start index, inclusive
     * @param toIndex - the end index, exclusive
     * @return - a sublist of entities
     */
    public List<T> subList(int fromIndex, int toIndex) {
        return entities.subList(fromIndex, toIndex);
    }

    // =========================================================================
    /**
     * Replaces an entity at a specified index with a new entity.
     * @param index - the index of the entity to replace
     * @param entity - the new entity to set
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void setEntity(int index, T entity) {
        entities.set(index, entity);
    }

    // =========================================================================
    /**
     * Prints all entities in the list.
     */
    public void printEntities() {
        entities.stream().forEach(entity -> System.out.println(entity));
    }

    /**
     * Checks if the list contains a specific entity.
     * @param entity - the entity to check
     * @return - true if the list contains the entity, false otherwise
     */
    public boolean containsEntity(T entity) {
        return entities.contains(entity);
    }

    // =========================================================================
    /**
     * Gets the size of the list.
     * @return - the number of entities in the list
     */
    public int size() {
        return entities.size();
    }

    /**
     * Checks if the list is empty.
     * @return - true if the list is empty, otherwise false
     */
    public boolean isEmpty() {
        return entities.isEmpty();
    }

    // =========================================================================
    /**
     * Converts the list of entities to an array.
     * @return - an array containing all entities in the list
     */
    public Object[] toArray() {
        return entities.toArray();
    }

    // =========================================================================
    /**
     * Removes an entity from the list.
     * @param entity - the entity to remove
     * @return - true if the entity was removed, otherwise throws an exception
     */
    public boolean removeEntity(T entity) {
        if(entities.remove(entity)){
            return true;
        } else {
            throw new NoSuchElementException("Entity not found: " + entity);
        }
    }

    /**
     * Clears all entities from the list.
     */
    public void clear() {
        entities.clear();
    }
}
