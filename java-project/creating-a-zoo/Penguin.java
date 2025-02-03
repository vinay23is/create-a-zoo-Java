import java.util.Scanner;

import static java.lang.System.out;

public class Penguin extends Animal implements Eat, Walk {
    private String color;
    private int walkSpeed;
    private int swimSpeed;
    private boolean swimming;

    public Penguin() {
        super("Penguin");
        this.color = "Unknown";
        this.walkSpeed = 0;
        this.swimSpeed = 0;
        this.swimming = false;
    }

    public Penguin(String color, int walkSpeed, int swimSpeed, boolean swimming) {
        super("Penguin");
        this.color = color;
        this.walkSpeed = walkSpeed;
        this.swimSpeed = swimSpeed;
        this.swimming = swimming;
    }

    public int getWalkSpeed(){
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed){
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed(){
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed){
        this.swimSpeed = swimSpeed;
    }

    public boolean isSwimming(){
        return swimming;
    }
    public void setSwimming(boolean swimming){
        this.swimming = swimming;
    }

    public void setProperties(Scanner keyboard) {
        System.out.println("Enter color: ");
        color = keyboard.next();
        System.out.println("Enter walking speed: ");
        walkSpeed = keyboard.nextInt();
        System.out.println("Enter swim speed: ");
        swimSpeed = keyboard.nextInt();
        System.out.println("Is the penguin swimming? true/false");
        swimming = keyboard.nextBoolean();
    }

    public void displayProperties() {
        System.out.println("Penguin properties: ");
        System.out.println("Color: " + color);
        System.out.println("Speed: " + walkSpeed + " " + swimSpeed);
        System.out.println("Swimming: " + (swimming ? "Yes" : "No"));
    }

    @Override
    public void walking(){
        System.out.println(getNameOfAnimal()+ ": I am walking at the speed " + walkSpeed + " mph");
    }
    @Override
    public void swimming(){
        System.out.println(getNameOfAnimal()+ ": I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted(){
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public String getNameOfAnimal(){
        return "Penguin";
    }
}