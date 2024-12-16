package src.JavaCourse.CoreJava.OOPS.Abstraction;

public class Car {
    private void moveBreakPad(){}
    private void changePistonSpeed(){}
    private void createSpark(){}

    public void turnOnCar(){
        createSpark();
    }
    public void accelerate(){
        changePistonSpeed();
    }
    public void applyBreak(){
        moveBreakPad();
    }
}
