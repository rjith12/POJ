import java.util.Scanner;
public class CountLetters {
        public static void main(String[] args) {
             Scanner input = new Scanner (System.in);
             String x;
             System.out.print ("Enter a phrase: ");
             x = input.nextLine();
             input.close();
             int[] y = new int[26];
             for ( int i = 0; i < x.length(); i++ ) {
                  char ch =  x.charAt(i);
                  int value = (int) ch;
                  if (value >= 97 && value <= 122){
                  y[ch - 'a']++;
                 }
             }
             for (int i = 0; i < y.length; i++) {
                 if(y[i]>0){
                   char ch = (char) (i+97);
                       System.out.println(ch + ": "+ y[i]);
                     }         
                }

        }

    }

