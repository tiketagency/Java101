package friday.todolist.test;

import friday.todolist.implementation.ToDoList;
import friday.todolist.tasks.GoOutTask;
import friday.todolist.tasks.LearnGeometryTask;
import friday.todolist.tasks.SleepTask;
import friday.todolist.tasks.StudyForAlgebraTask;
import friday.todolist.tasks.Task;

public class TodoTest {
	public static void main(String[] args) {
		ToDoList todo = new ToDoList(11);
		Task algebra = new StudyForAlgebraTask(2, 5f);
		Task geometry = new LearnGeometryTask(10, 6f);
		Task sleep = new SleepTask(9, 5f);
		Task goOut = new GoOutTask(2, 3f);
		
		todo.addTask(sleep);
		todo.addTask(goOut);
		todo.addTask(algebra);
		todo.addTask(geometry);
		System.out.println(todo);
		todo.changePriority(sleep, 10);
		System.out.println(todo);

		todo.markFinished(geometry);
		todo.markFinished(goOut);
		todo.markCancelled(sleep);

		if (todo.canFinish()) {
			System.out.println("\nWoohoo!");
		} else {
			System.out.println("I am ...screwed :(");
		}
		System.out.println(todo);
		System.out.println(todo.top()); // StudyForAlgebraTask
		System.out.println(todo.getTimeNeeded() + " hours");
	}
}
