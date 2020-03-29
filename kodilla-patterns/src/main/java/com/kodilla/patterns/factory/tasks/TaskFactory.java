package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";
    public static final String SHOP = "SHOP";

    public final Task proceedWithTask(final String taskClass) {

        switch (taskClass) {
            case PAINT:
                return new PaintingTask("Paint 1","Blue","Face");
            case DRIVE:
                return new DrivingTask("Drive 1","Berlin","Car");
            case SHOP:
                return new ShoppingTask("Shop 1", "Potatoes",2);
            default:
                return null;

        }
    }
}
