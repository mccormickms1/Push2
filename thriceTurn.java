import java.util.Scanner;

public class thriceTurn {
    
    public static void main(String[] args) {
        int rollOne;
        int rollTwo;
        int rollThree;
        double tally;
        int tWorth;
        tWorth = 0;
        tally = 0;
        int i = 1;
        boolean roundOne = true;
        boolean roundThree = true;
        String retire;

        Scanner scan = new Scanner(System.in);

        System.out.println("Round 1:");
        System.out.println("");

        while (roundOne) {
            rollOne = (int)(Math.random()*6 + 1);
            rollTwo = (int)(Math.random()*6 + 1);
            rollThree = (int)(Math.random()*6 + 1);

            System.out.println("Roll " + i + ": " + rollOne + " " + rollTwo + " " + rollThree);

            if (rollOne == rollTwo && rollTwo == rollThree) {
                roundOne = false;
                tWorth = rollOne;
            } else if (i%3 != 0) {
                tally = tally + rollOne + rollTwo + rollThree;
            } else {
                tally = tally - rollOne - rollTwo - rollThree;
            }
            i++;
        }
        
        System.out.println("");
        System.out.println("Score: " + tally);
        System.out.println("");

        System.out.println("Round 2:");
        System.out.println("");

        for (int n = 0; n < tWorth; n++) {
            rollOne = (int)(Math.random()*6 + 1);
            rollTwo = (int)(Math.random()*6 + 1);
            rollThree = (int)(Math.random()*6 + 1);
            System.out.println("Roll " + (n + 1) + ": " + rollOne + " " + rollTwo + " " + rollThree);
            tally = tally + (rollOne * rollTwo * rollThree);
        }

        System.out.println("");
        System.out.println("Score: " + tally);
        System.out.println("");

        System.out.println("Round 3:");
        System.out.println("");

        System.out.println("");
        System.out.println("Enter y to retire, or n to continue rolling");
        System.out.println("");

        i = 1;

        while (roundThree) {
            System.out.print("Retire: ");
            retire = scan.next();

            if (retire.equals("n")) {
                 rollOne = (int)(Math.random()*6 + 1);
                rollTwo = (int)(Math.random()*6 + 1);
                rollThree = (int)(Math.random()*6 + 1);
                System.out.println("Roll " + i + ": " + rollOne + " " + rollTwo + " " + rollThree);
                
                if (rollOne == rollTwo && rollTwo == rollThree) {
                    if (rollOne == tWorth) {
                        tally = tally * 3;
                        System.out.println("THRICE CHAMPION");
                        roundThree = false;
                    } else {
                        tally = rollOne;
                        System.out.println("YOU SUCK");
                        roundThree = false;
                    }
                } else {
                    tally = tally + (Math.pow(3, i - 1));
                    System.out.println("Score: " + tally);

                }
                i++;
            } else if (retire.equals("y")) {
                roundThree = false;
            }

        }

        System.out.println("");
        System.out.println("Final Score: " + tally);
        System.out.println("");
    }
}