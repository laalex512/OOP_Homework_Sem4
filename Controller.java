package Homework4;

import Homework4.services.TaskBook;
import Homework4.tasks.Task;
import Homework4.utils.ReadFromJson;
import Homework4.utils.ReadFromTxt;
import Homework4.utils.WriteToJson;
import Homework4.utils.WriteToTxt;
import java.util.logging.Logger;

public class Controller {

	public void start() {
		Logger logger = Logger.getAnonymousLogger();
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

		logger.info("\n" + book1.toString());
		new WriteToTxt().write(book1, "Homework4/book1.txt");
		logger.info("\n" + new ReadFromTxt().readBook("Homework4/book1.txt").toString());

		WriteToJson writer = new WriteToJson();
		writer.writeJson(writer.createJsonArray(book1), "Homework4/book1.json");
		ReadFromJson jsonReader = new ReadFromJson();
		TaskBook book2 = jsonReader.readJson("Homework4/book1.json");
		logger.info("\n" + book2.toString());
	}
}
