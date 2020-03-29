package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;
    boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {

        System.out.println("Is task executed? " + isTaskExecuted);
        System.out.println("You are starting shopping and you want to buy: " + whatToBuy + ", " + "quantity: " + quantity);
        System.out.println("You have bought: " + whatToBuy + ", " + "quantity: " + quantity);
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

