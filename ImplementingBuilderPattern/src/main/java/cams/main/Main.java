package cams.main;

import cams.model.Task;
import cams.model.TaskBuilder;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task.getDescription());
        System.out.println(task.getSummary());
        System.out.println(task.getDueDate());
        System.out.println(task.getClass());
    }

}
