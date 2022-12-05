package Homework4;

import Homework4.services.TaskBook;
import Homework4.tasks.Task;
import Homework4.utils.ReadFromTxt;
import Homework4.utils.WriteToTxt;

public class Controller {
	public void start(){
		Task task1 = new Task(1, 1, "Ivan", "Ivanov");
		Task task2 = new Task(2, 1, "Ivan", "Ivanov");
		Task task3 = new Task(3, 2, "Ivan", "Ivanov");
		Task task4 = new Task(4, 2, "Ivan", "Ivanov");
		Task task5 = new Task(5, 3, "Petr", "Petrov");

		TaskBook book1 = new TaskBook();
		book1.addTask(task1);
		book1.addTask(task2);
		book1.addTask(task3);
		book1.addTask(task4);
		book1.addTask(task5);

		System.out.println(book1);
		new WriteToTxt().write(book1, "Homework4/book1.txt");
		System.out.println(new ReadFromTxt().readBook("Homework4/book1.txt"));
	}
}
