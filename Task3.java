import java.util.Scanner;
public class Task3{
    public static void main(String [] args){
        /* student grade calculator */
        int totalSub , totalMarks=0;
        double average;
        int marks[] = new int[15];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of subjects: ");
        totalSub = sc.nextInt();
        System.out.print("Enter the marks of every subject : ");
        
        for(int i=0;i<totalSub;i++){
            marks[i] = sc.nextInt();
            totalMarks +=marks[i];
        }
        System.out.println("Total marks are: "+ totalMarks);
        average = totalMarks / totalSub;
        char lettergrade = CalculatorGrade(average);
        System.out.printf("The Average Grade Is : %.2f\n", average);
        System.out.println("The Letter Grade Is : " + lettergrade);
        sc.close();
    }

    public static char CalculatorGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}  