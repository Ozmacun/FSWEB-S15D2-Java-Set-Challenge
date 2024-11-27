package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

import static org.example.entity.StringSet.findUniqueWords;

public class Main {
    public static void main(String[] args) {
        /*Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "desc", "ann", Status.ASSIGNED, Priority.LOW);
        Task taskAnn2 = new Task("workintech", "desc2", "ann", Status.IN_QUEUE, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);


        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("workintech", "desc", "bob", Status.ASSIGNED, Priority.LOW);
        Task taskBob2 = new Task("workintech", "desc2", "bob", Status.IN_QUEUE, Priority.MED);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("workintech", "desc", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task taskCarol2 = new Task("workintech", "desc2", "carol", Status.IN_QUEUE, Priority.MED);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech", "desc 6", null, Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("Bob's tasks: " + taskData.getTasks("bob"));
        System.out.println("Ann's tasks: " + taskData.getTasks("ann"));
        System.out.println("Alls tasks: " + taskData.getTasks("all"));

        System.out.println("unassigned: " + taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));*/
        Set<String> uniqueWords = findUniqueWords();
        findUniqueWords();

    }
}