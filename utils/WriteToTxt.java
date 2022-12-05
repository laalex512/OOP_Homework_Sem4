package Homework4.utils;

import Homework4.services.TaskBook;
import Sem2.Data.Student;
import Sem2.Data.Teacher;
import Sem2.Data.User;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
	public static void write(TaskBook taskBook, String pathFile) {
		try (FileWriter fw = new FileWriter(pathFile, false)) {
			for (int i = 0; i<taskBook.listTasks.size(); i++){
				fw.write(taskBook.listTasks.get(i).toString() + "\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
