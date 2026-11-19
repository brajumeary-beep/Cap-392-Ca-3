class Result {
    void calculateGrade(int marks) {
        System.out.println("Calculating Grade");
    }
}

class Student extends Result {
    @Override
    void calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }
        else if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.calculateGrade(95);
        s.calculateGrade(80);
        s.calculateGrade(60);
        s.calculateGrade(30);
        s.calculateGrade(110);
    }
}