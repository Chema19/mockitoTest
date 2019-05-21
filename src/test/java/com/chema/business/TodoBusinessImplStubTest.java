package com.chema.business;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;


import com.chema.data.api.TodoService;
import com.chema.data.stub.TodoServiceStub;


public class TodoBusinessImplStubTest {
	@Test
	public void  usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

}
