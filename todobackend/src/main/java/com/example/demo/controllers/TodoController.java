package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.fakedata.IDataFactory;
import com.example.demo.fakedata.ToDoDataFactory;
import com.example.demo.models.todo;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

	@GetMapping("")
	public List<todo> getAllTodos()
	{
		IDataFactory df = new ToDoDataFactory();
		return df.getAll();
	}

}
