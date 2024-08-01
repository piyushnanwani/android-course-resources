package com.example.helloworld

class ToDoRepository {
    private val todoList = mutableListOf<ToDoItem>()

    fun addTodoItem(item: ToDoItem) {
        todoList.add(item)
    }

    fun getTodoItems(): List<ToDoItem> {
        return todoList
    }
}
