import java.util.Scanner;
public class CourseGrades {
static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
int[][] x = new int[12][5];
 int a=0;
 int b=0;
 getGrades(x);
 studentAverage(x, a);
 testAverage(x, b);

    }
public static int[][] getGrades(int[][] grades) {
Scanner input = new Scanner (System.in);
 for(int i = 0; i < grades.length; i++) {
 System.out.println("Student " +(i+1));
for (int j = 0; j < grades[0].length; j++) {
 System.out.print("Enter in a score: ");
 grades[i][j]= input.nextInt();
}
}
 return(grades);
 }
public static void studentAverage(int[][] grades, int s) {
 System.out.print("Enter the desired student's  average: ");
 s = input.nextInt();
 int sum=0, studentAverage=0;
 for (int i=s-1; i<s; i++) {
 for (int j=0; j<5; j++) {
 sum += grades[i][j];
}
}
 studentAverage=sum/5;
System.out.println("The average grade for the student " + s + " is " + studentAverage);
        
        
        
    }
 public static void testAverage(int[][] grades, int testNum) {
 System.out.print("Enter the desired test average: ");
 tn = input.nextInt();
int sum=0, testAverage=0;
 for (int i=0; i<12; i++) {
for (int j=tn-1; j<tn; j++) {
 sum += grades[i][j];
}
 }
 testAverage=sum/12;
System.out.println("The average grade for test " + testNum + " is " + testAverage);
input.close();        
    }
}
