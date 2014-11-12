package net.shangtech.base;

public interface IBaseService<T> {
	
	void insert(T entity);
	
	void update(T entity);
	
	T find(Long id);
	
	void delete(Long id);
}
