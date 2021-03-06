package net.shangtech.base;


/**
 * 
 * @author songxh
 *
 */
public interface IBaseDao<T> {
	
	void insert(T entity);
	
	void update(T entity);
	
	T find(Long id);
	
	void delete(Long id);
}
