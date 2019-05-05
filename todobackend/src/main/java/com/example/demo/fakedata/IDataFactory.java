package com.example.demo.fakedata;

import java.util.HashMap;
import java.util.List;

public interface IDataFactory {
	public <T> List<T> getAll();

	public <T, K, V> List<T> searchByCriteria(HashMap<K, V> criteria);

	public <T> void update(T entity);

	public <T> void delete(T entity);

}