package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {

        System.out.println("Is task executed? " + isTaskExecuted);
        System.out.println("You are starting paint: " + whatToPaint + ", " + "color: " + color);
        System.out.println("You have painted: " + whatToPaint + ", " + "color: " + color);
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
