import java.util.Scanner;
public class NameBackwards {
        public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          String b;
          System.out.println ("Enter your name: ");
          b = input.nextLine();
          input.close();
          b = b.toLowerCase();
          int a = b.length()-1;
          char letters[] = new char[a];
          letters = b.toCharArray(); 
          for (int i=a; i>=0; i--) {
           System.out.print(letters[i]);
          }
          
         }


    }
