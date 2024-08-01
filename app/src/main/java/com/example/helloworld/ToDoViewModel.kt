package com.example.helloworld

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToDoViewModel : ViewModel() {
    private val repository = ToDoRepository()
    private val _todoItems = MutableLiveData<List<ToDoItem>>()
    val todoItems: LiveData<List<ToDoItem>> get() = _todoItems

    fun addTodoItem(task: String) {
        repository.addTodoItem(ToDoItem(task))
        _todoItems.value = repository.getTodoItems()
    }
}
