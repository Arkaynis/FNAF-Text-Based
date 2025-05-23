import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("FIVE NIGHT AT FREDDY'S");
        System.out.println("Please make an option below:" + "\n");
        System.out.println("1. Start Game");
        System.out.println("2. 6th Night");
        System.out.println("3. Ultra Custom Night");
        System.out.println("4. Options");
        System.out.println();

        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("\nStarting Game..." + "\n\n" + "12:00 AM" + "\n" + "1st Night");
                Game game = new Game();

                while (game.getAlive() == true){
                    game.tick();
                    String action = scan.next();

                        if (action == "c"){

                        }else if (action == "help"){
                            System.out.println("c: camera");
                            System.out.println("ll: left lights");
                            System.out.println("rl: right lights");
                            System.out.println("ld: left door");
                            System.out.println("rd: right lights");
                        }else if (action == "ll"){
                            Lights.leftLightTrigger();
                        }else if (action == "rl"){
                            Lights.rightLightTrigger();
                        }else if (action == "ld"){

                        }else if (action == "rd"){

                        }else {
                            game.tick();
                        }
                }


        } else if (choice == 2) {
            System.out.println("\nStarting 6th Night...");
        } else if (choice == 3) {
            System.out.println("\nStarting Ultra Custom Night...");
        } else if (choice == 4) {
            System.out.println("\nOpening Options...");
        } else {
            System.out.println("\nInvalid choice. Please try again.");
        }

        scan.close();
    }
}
