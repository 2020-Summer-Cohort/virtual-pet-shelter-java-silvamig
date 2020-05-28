package shelter;

import java.util.Scanner;
/*
 * Missing the requirement to be able to interact with an individual pet, maybe change your cuddle with all
 * to cuddle with a pet instead of cuddle with all pets.
 */
public class VirtualPetShelterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userChoice;

        boolean running = true;

        VirtualPetShelter bunnyShelter = new VirtualPetShelter();
        bunnyShelter.add(new VirtualPet("Picasso  ", "Speckled Lionhead  ", 10, 10, 25));
        bunnyShelter.add(new VirtualPet("Dali  ", "Brown MiniLop  ", 5, 10, 18));
        bunnyShelter.add(new VirtualPet("Pollack  ", "Black Lionhead  ", 7, 7, 20));

        System.out.println("Welcome to the Columbus Rabbit Rescue");
        System.out.println("Status of the pets is: ");
        System.out.println();
        System.out.println("Name:" + "Hunger:" + "Thirst:" + "Happiness:");
        System.out.println(bunnyShelter.showPets());

        while (running) {

            System.out.println("What would you like to do ?");
            System.out.println("Press 1 to Feed the Pets.");
            System.out.println("Press 2 to Give the Pets a drink.");
            System.out.println("Press 3 to Cuddle the Wittle Buns.");
            System.out.println("Press 4 to Admit a Bun.");
            System.out.println("Press 5 to Adopt a Bun.");
            System.out.println("Press 6 to EXIT and Abandon the Buns.");
            String userInput = input.nextLine();

            if (userInput.equals("1")) {
                bunnyShelter.feedAllPets();
                bunnyShelter.tick();
            }
            if (userInput.equals("2")) {
                bunnyShelter.waterAllPets();
                bunnyShelter.tick();
            }
            if (userInput.equals("3")) {
                bunnyShelter.cuddleAllPets();
                bunnyShelter.tick();
            }
            if (userInput.equals("4")) {
                String petDescription;
                System.out.println("You are admitting a bunny.");
                System.out.println("What is their name?");
                userChoice = input.nextLine();
                System.out.println("Please enter their description.");
                petDescription = input.nextLine();
                bunnyShelter.add(new VirtualPet(userChoice, petDescription, 10, 7, 15));

            }
            if (userInput.equals("5")) {
                System.out.println("Which bunny would you like to adopt?");
                System.out.println(bunnyShelter.seeDescription());
                userChoice = input.nextLine();
                System.out.println("You are adopting " + userChoice);
                bunnyShelter.adopt(bunnyShelter.findNewPet(userChoice));
            }
            if (userInput.equals("6")) {
                running = false;
            }

        }
        //bunnyShelter.tick();


    }
}
