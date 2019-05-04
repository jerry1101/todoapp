package com.example.demo.fakedata;

import java.util.HashMap;
import java.util.List;

public interface IDataFactory<K, V> {
	public List<?> getAll();

	public List<?> searchByCriteria(HashMap<K, V> criteria);

	public <T> void update(T entity);

	public <T> void delete(T entity);

}