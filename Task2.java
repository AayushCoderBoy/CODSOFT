import java.util.Scanner;

class Student {

    private int[] marks = new int[5];
    private int total = 0;
    private double percentage;

    public void setInputMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public void calculateTotalMarks() {
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        System.out.println("Total Marks = " + total);
    }

    public void calculateAveragePercent() {
        percentage = (double) total / 5;
        System.out.println("Average Percentage = " + percentage);
    }

    public String getGrade() {
        
        if (percentage >= 95) {
            return "A+";
        }
        
        else if (percentage >= 90) {
            return "A";
        }
        
        else if (percentage >= 80) {
            return "B+";
        }
        
        else if (percentage >= 70) {
            return "B";
        }
        
        else if (percentage >= 60) {
            return "C+";
        }
        
        else {
            return "Fail";
        }
    }
}

public class Task2 {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.setInputMarks();
        obj.calculateTotalMarks();
        obj.calculateAveragePercent();
        System.out.println("Grade = " + obj.getGrade());
    }
}