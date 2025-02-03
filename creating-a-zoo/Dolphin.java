import java.util.Scanner;

import static java.lang.System.out;

public class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private int swimmingSpeed;

    public Dolphin(){
        super("Dolphin");
        this.color = "Unknown";
        this.swimmingSpeed = 0;
    }

    public Dolphin(String color, int speed){
        super("Dolphin");
        this.color = color;
        this.swimmingSpeed = speed;
    }

    public void setProperties(Scanner keyboard) {
        System.out.println("Enter color: ");
        color = keyboard.next();
        System.out.println("Enter swimming speed: ");
        swimmingSpeed = keyboard.nextInt();
    }

    public void displayProperties() {
        System.out.println("Dolphin properties: ");
        System.out.println("Color: " + color);
        System.out.println("Swimming speed: " + swimmingSpeed);
    }

    public String getColor() {
        return color;
    }    public void setColor (String color){
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed (int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swimming(){
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted(){
        System.out.println(getNameOfAnimal() + ": I have eaten fish.");
    }

    @Override
    public String getNameOfAnimal(){
        return "Dolphin";
    }
}



