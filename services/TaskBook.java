package Homework4.services;

import Homework4.tasks.Task;
import java.util.ArrayList;

public class TaskBook {
	public ArrayList<Task> listTasks;

	public TaskBook(){
		listTasks = new ArrayList<>();
	}

	public void addTask(Task task){
		this.listTasks.add(task);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Task i : this.listTasks){
			sb.append(i + "\n");
		}
		return sb.toString();
	}
}
