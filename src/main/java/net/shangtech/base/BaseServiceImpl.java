package net.shangtech.base;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

public class BaseServiceImpl<T> implements IBaseService<T> {
	
	private static final String FIELD_BASE_DAO = "dao";

	public void insert(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	protected Class<?> getEntityClass() {
		Class<?> entityClass = (Class<?>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		return entityClass;
	}
	
	private IBaseDao<T> dao(){
		Field field = null;
		try {
			field = this.getClass().getField(FIELD_BASE_DAO);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		if(field == null){
			throw new IllegalStateException("");
		}
//		return (IBaseDao<T>) field.get(this);
	}

}
