import java.util.Scanner;
public class StudentRoster {
        public static void main(String[] args) {
            int x;
            Scanner input = new Scanner (System.in);
            
            System.out.print("Enter the number of students on the roster: ");
            x = input.nextInt();
            String[] y = new String[x];
            input.nextLine();
            
            for (int i = 0; i < x; i++) {
                System.out.println("Enter the name of the students on the roster: ");
                y[i] = input.nextLine();
            }
            
            System.out.println("Student Roster:");
            for(String element : y) {
                System.out.println(element);
            }
            input.close();
        }
    }