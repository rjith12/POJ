 import java.util.Scanner;
public class NumberCounts {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] x = new int[10];
            System.out.println("Enter a number: ");
            String y = input.next();
            input.close();
            
            char count;
            int value;
            for (int i=1; i <=y.length(); i++) {
            count=y.charAt(i-1);
            value=Character.getNumericValue(count);
                x[value] +=1;
            }
            for (int i =0; i<=9; i++) {
                System.out.println(i+ ": " + x[i]);
            }

        
        }

}
