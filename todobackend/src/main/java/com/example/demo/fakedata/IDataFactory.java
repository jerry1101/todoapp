package com.example.demo.fakedata;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.todo;

public interface IDataFactory {
	public <T> List<T> getAll();

	public <T, K, V> List<T> searchByCriteria(HashMap<K, V> criteria);

	public <T> todo searchById(int id);
	
	public <T> void update(T entity);

	public <T> void delete(T entity);

}