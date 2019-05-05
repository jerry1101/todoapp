package com.example.demo.fakedata;

import java.util.List;

import org.junit.Test;
import org.testng.Assert;

import com.example.demo.models.todo;

public class ToDoDataFactoryTest {

	@Test
	public final void testGetAll() throws Exception {
		// TODO
		IDataFactory df = new ToDoDataFactory();
		List<todo> list = df.getAll();
		Assert.assertEquals(100, list.size());

	}

}
