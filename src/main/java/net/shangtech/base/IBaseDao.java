package net.shangtech.base;

import java.io.Serializable;

/**
 * 
 * @author songxh
 *
 */
public interface IBaseDao<T, PK extends Serializable> {
	
	void insert(T entity);
	
	void update(T entity);
	
	T find(PK id);
	
	void delete(PK id);
}
