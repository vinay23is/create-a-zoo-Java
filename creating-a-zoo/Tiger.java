import java.util.Scanner;
import static java.lang.System.out;

public class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        super("Tiger");
        this.numberOfStripes = 0;
        this.speed = 0;
        this.soundLevelOfRoar = 0;
    }

    public Tiger(int stripes, int speed, int roarLevel) {
        this.numberOfStripes = stripes;
        this.speed = speed;
        this.soundLevelOfRoar = roarLevel;
    }

    public int getSoundLevel(){
        return soundLevelOfRoar;
    }

    public void setSoundLevel(int soundLevelOfRoar){
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public void setProperties(Scanner keyboard) {
        System.out.println("Enter number of stripes: ");
        numberOfStripes = keyboard.nextInt();
        System.out.println("Enter speed: ");
        speed = keyboard.nextInt();
        System.out.println("Enter sound level of roar: ");
        soundLevelOfRoar = keyboard.nextInt();
    }

    void displayProperties() {
        System.out.println("Tiger properties: ");
        System.out.println("Number of stripes: " + numberOfStripes);
        System.out.println("Speed: " + speed);
        System.out.println("Roar level: " + soundLevelOfRoar);
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes (int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed (int speed){
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar (int soundLevelOfRoar){
        this.soundLevelOfRoar = soundLevelOfRoar;
    }
    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am moving at the speed " + speed);
    }
    @Override
    public void eatingFood() {
        System.out.println("The animal: Tiger is eating.");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
    @Override
    public String getNameOfAnimal() {
        return "Tiger";
    }
}