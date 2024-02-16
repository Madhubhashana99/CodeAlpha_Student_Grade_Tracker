import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int numStudents = scanner.nextInt();

        //Create array to store grade
        int[] grades = new int[numStudents];

        //Input grades from the teacher
        for(int i=0;i<numStudents;i++){
            System.out.println("Enter the grade for student " + (i+1)+"; ");
            grades[i] = scanner.nextInt();
        }

        //Compute average, highest and lowest scores
        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for(int grade:grades){
            sum += grade;

            if (grade>highest){
                highest=grade;
            }
            if (grade<lowest){
                lowest=grade;
            }
        }

        double average = (double) sum/numStudents;

        //Display results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();

    }
}
