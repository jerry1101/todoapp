package com.example.demo.fakedata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.models.todo;

import lombok.val;
import fabricator.*;
import fabricator.Fabricator;

public class ToDoDataFactory implements IDataFactory {
	private static Words wd = Fabricator.words();
	private static Calendar cd = Fabricator.calendar();

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		List<todo> result  = new ArrayList<>();
		for (int i =0; i<101; i++) {
			result.add(new todo(wd.sentence(100),wd.paragraph(300),cd.randomDate().asDate(),cd.randomDate().asDate()));
		}
		return result;
		
	}

	@Override
	public List searchByCriteria(HashMap criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub

	}

}
