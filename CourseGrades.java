import java.util.Scanner;
public class CG {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] grades = new int[12][5];
        int studentNum=0;
        int testNum=0;
        getGrades(grades);
        studentAverage(grades, studentNum);
        testAverage(grades, testNum);
        
    }
    public static int[][] getGrades(int[][] grades) {
        Scanner input = new Scanner (System.in);
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Student " +(i+1));
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print("Enter the score: ");
                grades[i][j]= input.nextInt();
            }
        }
        return(grades);
        }
    
    public static void studentAverage(int[][] grades, int sn) {
        System.out.print("Enter the desired test average: ");
        sn = input.nextInt();
        int s=0, sa=0;
        for (int i=sn-1; i<sn; i++) {
            for (int j=0; j<5; j++) {
                s += grades[i][j];
            }
        }
        sa=s/5;
		System.out.println("The average grade for student " + sn + " is " + sa);
        
        
        
    }
    public static void testAverage(int[][] grades, int tn) {
        System.out.print("Enter the desired test average: ");
        tn = input.nextInt();
        int sum=0, ta=0;
        for (int i=0; i<12; i++) {
            for (int j=tn-1; j<tn; j++) {
                sum += grades[i][j];
            }
        }
        ta=sum/12;
        System.out.println("The average grade for test " + tn + " is " + ta);
        input.close();        
    }
}
