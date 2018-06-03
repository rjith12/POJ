import java.util.Scanner;
public class CourseGrades {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] grades = new int[12][5];
        int studentNum=0;
        int testNum=0;
        getGrades(grades);
        studentAvg(grades, studentNum);
        testAvg(grades, testNum);
        
    }
    public static int[][] getGrades(int[][] grades) {
        Scanner input = new Scanner (System.in);
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Student " +(i+1));
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print("Enter a score: ");
                grades[i][j]= input.nextInt();
            }
        }
        return(grades);
        }
    
    public static void studentAvg(int[][] grades, int studentNum) {
        System.out.print("Which student's average would you like to see? ");
        studentNum = input.nextInt();
        int sum=0, studentAvg=0;
        for (int i=studentNum-1; i<studentNum; i++) {
            for (int j=0; j<5; j++) {
                sum += grades[i][j];
            }
        }
        studentAvg=sum/5;
        System.out.println("The average grade for student " + studentNum + " is " + studentAvg);
        
        
        
    }
    public static void testAvg(int[][] grades, int testNum) {
        System.out.print("Which test average would you like to see? ");
        testNum = input.nextInt();
        int sum=0, testAvg=0;
        for (int i=0; i<12; i++) {
            for (int j=testNum-1; j<testNum; j++) {
                sum += grades[i][j];
            }
        }
        testAvg=sum/12;
        System.out.println("The average grade for test " + testNum + " is " + testAvg);
        input.close();        
    }
}

