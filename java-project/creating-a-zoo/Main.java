import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    Tiger tiger = new Tiger(0, 0, 0);
                    do {
                        int actionChoice = animalDetailsManipulationMenu(keyboard);// get menu choice
                        switch (actionChoice) {
                            case 1:
                                tiger.setProperties(keyboard);
                                break;

                            case 2:
                                tiger.displayProperties();
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);

                    break;
                case 2:
                    Dolphin dolphin = new Dolphin("", 0);
                    do {
                        int actionChoice = animalDetailsManipulationMenu(keyboard);// get menu choice
                        // get menu choice
                        switch (actionChoice) {
                            case 1:
                                dolphin.setProperties(keyboard);
                                break;

                            case 2:
                                dolphin.displayProperties();
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    Tiger tiger = new Tiger(0, 0, 0);
                    do {
                        int actionChoice = animalDetailsManipulationMenu(keyboard);// get menu choice
                        switch (actionChoice) {
                            case 1:
                                tiger.setProperties(keyboard);
                                break;

                            case 2:
                                tiger.displayProperties();
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);

                    break;
                case 2:
                    Dolphin dolphin = new Dolphin("", 0);
                    do {
                        int actionChoice = animalDetailsManipulationMenu(keyboard);// get menu choice
                        // get menu choice
                        switch (actionChoice) {
                            case 1:
                                dolphin.setProperties(keyboard);
                                break;

                            case 2:
                                dolphin.displayProperties();
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    Penguin penguin = new Penguin("", 0, 0, false);
                    do {
                        int actionChoice = animalDetailsManipulationMenu(keyboard);
                        switch (actionChoice) {
                            case 1:
                                penguin.setProperties(keyboard);
                                break;
                            case 2:
                                penguin.displayProperties();
                                break;
                            case 3:
                                penguin.walking();
                                break;
                            case 4:
                                penguin.eatingFood();
                                break;
                            default:
                                out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? Enter 1 for yes/ 2 for no:");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                default:
                    out.println("Sorry, no such animal available");
            }
            System.out.println("Continue main Zoo menu? Enter 1 for yes/ 2 for no");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}






