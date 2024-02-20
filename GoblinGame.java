import java.util.Random;
import java.util.Scanner;

public class GoblinGame {
    static Random rnd = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the land of Gilmoria");
        waitForEnter();
        System.out.println("You were on a journey to visit your grandparents, when all of a sudden you find a church.");
        waitForEnter();
        System.out.println("There is an old man sitting just inside.");
        waitForEnter();
        System.out.println("\"You have to help me brave adventurer. I was out for a stroll and out of nowhere, I heard a scream in the woods and...\"");
        waitForEnter();
        System.out.println("\"Oh, where are my manners, my name is Old Man Irgo, and you are?\"");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("\"Nice to meet you " + name + "\"");
        waitForEnter();
        System.out.println("\"So as I was saying\"");
        waitForEnter();
        System.out.println("\"I heard a scream in the woods and ran in here to take shelter\"");
        waitForEnter();
        System.out.println("Just as the old man was talking, a goblin burst through the door.");
        waitForEnter();
        System.out.println("\"OH MY GOODNESS\"");
        waitForEnter();
        System.out.println("\"TAKE MY SWORD, I WILL BE OF NO HELP WITH IT\"");
        waitForEnter();
        System.out.println("You received | Old Man Irgo's Sword > 10-15 DMG");
        waitForEnter();
        tutorialgoblinfight();
        waitForEnter();
        System.out.println("\"Man that was a close one\"");
        waitForEnter();
        System.out.println("\"That goblin almost got us\"");
        waitForEnter();
        System.out.println("\"Theres probably going to be a lot more where ....\"");
        waitForEnter();
        System.out.println("\"Wait...\"");
        waitForEnter();
        System.out.println("\"Did I forget to turn the sword on?\"");
        waitForEnter();
        System.out.println("He reaches over and flips a switch on the backside of the sword");
        waitForEnter();
        System.out.println("As soon as he does this, the sword begins to emit an intense blinding light");
        waitForEnter();
        System.out.println("You feel as if you can kill as many goblins as it takes");
        waitForEnter();
        System.out.println("You received |  Goblin Slayer > 20-35 DMG");
        waitForEnter();
        System.out.println("\"And lets get you patched up, and little upgraded so you can take a beating\"");
        waitForEnter();
        System.out.println("Irgo rubs some dirt on your forehead, which doesn't seem to do anything");
        waitForEnter();
        System.out.println("All of a sudden, you can feel your body grow 3x bigger");
        waitForEnter();
        System.out.println("Your health is now 1000 hp");
        waitForEnter();
        System.out.println("Just as Irgo goes to speak, a horde of goblins burst through the door");
        waitForEnter();
        
        boolean validChoice = false;
        while (!validChoice) {
            System.out.println("You encounter 100 goblins! Will you fight or run?");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("fight")) {
                thousandgoblinfight();
                validChoice = true;
            } else if (choice.equalsIgnoreCase("run")) {
                System.out.println("You can't run from 100 goblins!");
                thousandgoblinfight();
                validChoice = true;
            } else {
                System.out.println("Invalid choice. Please type 'fight' or 'run'.");
            }
        }

        System.out.println("\"Man, you're pretty good at this whole goblin killing thing\"");
        waitForEnter();
        System.out.println("\"There's just one problem\"");
        waitForEnter();
        System.out.println("\"You haven't killed me\"");
        waitForEnter();
        System.out.println("As Irgo finishes his sentence, he begins to transform into a giant goblin");
        waitForEnter();
        System.out.println("The Goblin King appears | 20,000 HP");
        waitForEnter();
        System.out.println("\"You didn't think an old man could just rub dirt on you and make you stronger, did you?\"");
        waitForEnter();
        System.out.println("Another chandelier falls right on to the head of the Goblin King");
        waitForEnter();
        System.out.println("The Goblin King  | 20 HP");
        waitForEnter();
        while (true) {
            System.out.println("Take your final swing");
            String finalSwing = scanner.nextLine();
        
            if (finalSwing.equalsIgnoreCase("fight")) {
                System.out.println("The Goblin King has been felled");
                waitForEnter();
                System.out.println("You grab his crown and place it upon your head");
                waitForEnter();
                System.out.println("The end");
                waitForEnter();
                System.out.println("Thanks for playing");
                waitForEnter();
                System.exit(0);
            } else {
                System.out.println("You must type 'fight' to take the final swing.");
            }}
        }

    public static void thousandgoblinfight() {
        int goblinCount = 100;
        int goblinHealth = 50;
        int userHealth = 2000;

        for (int i = 1; i <= goblinCount; i++) {
            System.out.println("Fighting goblin #" + i);
            int remainingGoblinHealth = goblinHealth;

            while (remainingGoblinHealth > 0 && userHealth > 0) {
                System.out.println("Type 'fight' to attack: ");
                String userInput = scanner.nextLine();

                if (!userInput.equals("fight")) {
                    System.out.println("You must type 'fight' to attack!");
                    continue;
                }

                int swordDamage = rnd.nextInt(16) + 20;
                remainingGoblinHealth -= swordDamage;

                if (remainingGoblinHealth < 0) {
                    remainingGoblinHealth = 0;
                }

                System.out.println("You hit goblin #" + i + " for " + swordDamage + " damage.");
                System.out.println("Goblin #" + i + " health: " + remainingGoblinHealth);

                // Goblin attacks
                if (remainingGoblinHealth > 0) {
                    int goblinDamage = rnd.nextInt(11) + 10;
                    userHealth -= goblinDamage;

                    if (userHealth <= 0) {
                        userHealth = 0;
                        System.out.println("You were defeated by goblin #" + i);
                        return;
                    }

                    System.out.println("The goblin hits you for " + goblinDamage + " damage.");
                    System.out.println("Your remaining health: " + userHealth);
                }
            }

            if (remainingGoblinHealth <= 0) {
                System.out.println("You defeated goblin #" + i);
            }
        }
    }

    public static void tutorialgoblinfight() {
        int goblinhealth = 20;
        int playerhealth = 50;
    
        System.out.println("A goblin appears");
        scanner.nextLine(); // Added
        
        while (goblinhealth > 0 && playerhealth > 0) {
            System.out.println("Would you like to fight or run?");
            String choice = scanner.nextLine();
    
            if (choice.equalsIgnoreCase("fight")) {
                int swordDamage = rnd.nextInt(6) + 10;
                int goblinDamage = rnd.nextInt(6) + 5;
    
                System.out.println("You swing at the goblin");
                goblinhealth -= swordDamage;
                System.out.println("You deal " + swordDamage + " damage");
                scanner.nextLine(); // Added
                
                if (goblinhealth > 0) {
                    System.out.println("The goblin swings at you");
                    playerhealth -= goblinDamage;
                    System.out.println("He deals " + goblinDamage + " damage");
                    System.out.println("You have " + playerhealth + " health remaining");
                    scanner.nextLine(); // Added
                }
            } else if (choice.equalsIgnoreCase("run")) {
                System.out.println("The chandelier falls and crushes the goblin");
                break;
            } else {
                System.out.println("Invalid choice. Please type 'fight' or 'run'.");
            }
        }
    
        if (goblinhealth <= 0) {
            System.out.println("You defeated the goblin!");
        } else if (playerhealth <= 0) {
            System.out.println("You were defeated by the goblin!");
        }
    }

    public static void waitForEnter() {
        System.out.println("");
        scanner.nextLine();
    }
}    
