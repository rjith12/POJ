import java.util.Scanner;
public class FindName {
        public static void main (String[] args) {
              Scanner input = new Scanner (System.in);
              System.out.println("Number of names:");
              int x = input.nextInt();
              input.nextLine();
              String a;
              String b[] = new String[x];
              for (int i=0; i<x; i++) {
               System.out.print ("Enter a name: ");
               String name = input.nextLine(); 
               b[i] = name.toLowerCase();
              }
              System.out.println ("What name do you want to find?");
              a = input.nextLine();
              input.close();
              //find = find.toLowerCase();
              int y;
              y = ran(b, a);
              if (y == -1) {
               System.out.println("The name you are looking for is not in this list");
              }
              else if (y >=0 && y < x) {
               System.out.println (b[y] + " is located at index " + y);
              }
             }

        public static int ran( String[] array, String nameToFind) {
             int index = 0;
             while ((array[index] != nameToFind) && (index<array.length-1)) {
              index+=1;
             }
             
             if (array[index].equals(nameToFind)) {
              return(index);
             }
             else {
              return (-1);
             }
             
             }
            }
