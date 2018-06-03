import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class DiceRoll {
        public static void main(String[] args) {
            int[] outcomes;
            Scanner input = new Scanner(System.in);
            int numRolls;
            Random rand = new Random();
            int outcome;
            
            System.out.println("How many sides do you want on each die: ");
            int sides = input.nextInt();
            outcomes= new int[(3*sides+2)];
            System.out.print("How many rolls? ");
            numRolls = input.nextInt();
            
            for (int roll = 0; roll < numRolls; roll++) {
                outcome = (rand.nextInt(sides) + 1) + (rand.nextInt(sides) + 1) + (rand.nextInt(sides) + 1);
                outcomes[outcome] += 1;
            }

        
            for (int i = 3; i <= (3*sides); i++) {
                System.out.println(i + ": " + outcomes[i]);
            }
            input.close();

        }
    

    }
