package com.epam.mentoring.invman.dao;

import java.util.Collection;

/**
 * Generic interface for daos.
 * 
 * @author zeusz
 * 
 * @param <T>
 *            Type of entity handled by the actual dao.
 */
public interface DataAccessObject<T> {

    /**
     * save an object in db.
     * 
     * @param entity
     *            entity to save.
     */
    void save(T entity);

    /**
     * get all the entites with type T
     * 
     * @return A collection of entitites
     */
    Collection<T> findAll();

    /**
     * Find entity by id
     * 
     * @param id
     *            id of the entity
     * @return the found entity or null if there is no such entity.
     */
    T findById(long id);

    /**
     * Delete an entity from db.
     * 
     * @param entity
     *            entity to delete
     */
    void delete(T entity);

}
