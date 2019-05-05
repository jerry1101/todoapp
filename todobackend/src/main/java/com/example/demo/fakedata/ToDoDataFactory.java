package com.example.demo.fakedata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.todo;

import lombok.val;
import fabricator.*;
import fabricator.Fabricator;

public class ToDoDataFactory implements IDataFactory {
	private static Words wd = Fabricator.words();
	private static Calendar cd = Fabricator.calendar();
	private static List<todo> todos = null;

	@Override
	public List<todo> getAll() {
		if (todos == null) {
			todos = new ArrayList<todo>();
			for (int i = 1; i < 101; i++) {
				todos.add(new todo(new Long(i), wd.sentence(100), wd.paragraph(300), cd.randomDate().asDate(),
						cd.randomDate().asDate()));
			}

		}
		return todos;

	}

	@Override
	public List<todo> searchByCriteria(HashMap criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object entity) {

	}

	@Override
	public todo searchById(int id) {
		if (todos == null) {
			this.getAll();
		}
		
		Optional<todo> result = todos.stream().filter(x -> x.getTodoId().intValue() == id).findFirst();
		return result.isPresent()?result.get():new todo();
	}

}
