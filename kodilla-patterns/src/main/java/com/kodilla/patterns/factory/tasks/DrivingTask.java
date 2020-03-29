package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;
    boolean isTaskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {

        System.out.println("Is task executed? " + isTaskExecuted);
        System.out.println("You are starting your journey to: " + where);
        System.out.println("You have achieved destination: " + where);
        isTaskExecuted = true;
        System.out.println("Is task executed? " + isTaskExecuted);

    }

    @Override
    public boolean isTaskExecuted() {

        if(isTaskExecuted){
            return true; }

        System.out.println("Task: " + taskName + " is not executed!");
        return false;

    }
}
