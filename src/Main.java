import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


// ================ Task 1 ================
// 1.Write a program that checks the role of the user

        System.out.print("Enter your role: [user] - [admin] - [superuser]: ");
        String role = input.nextLine().toLowerCase();

        if(role.equals("admin")){
            System.out.println("Welcome admin");
        } else if (role.equals("superuser")){
            System.out.println("Welcome superuser");
        }else {
            System.out.println("Welcome user");
        }

// ================ Task 2 ================
// 2.Take three numbers from the user and print the greatest number.

        System.out.println("----- Enter three number -----");
        System.out.print("Input the 1st number: ");
        int n1 = input.nextInt(); // 25

        System.out.print("Input the 2nd number: ");
        int n2 = input.nextInt(); // 78

        System.out.print("Input the 3rd number: ");
        int n3 = input.nextInt(); // 87

        if (n1 > n2 && n1 > n3) {
            System.out.println("The Greatest: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The Greatest: " + n2);
        } else{
            System.out.println("The Greatest: " + n3);
        }

// ================ Task 3 ================
// 3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.

        System.out.print("Enter number of weekday: ");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Enter the number from 1 - 7");
                break;
        }

// ================ Task 4 ================
// 4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale:

        System.out.print("Enter your numeric score: ");
        int score = input.nextInt();
        char grade;
        if ( score >= 90 && score <= 100){
            grade = 'A';
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        } else if (score >= 80 && score < 90) {
            grade = 'B';
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        } else if (score >= 70 && score < 80) {
            grade = 'C';
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        } else if (score >= 60 && score < 70) {
            grade = 'D';
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        } else if (score < 60) {
            grade = 'F';
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        }else {
            System.out.println("Enter your numeric score from 0-100");
        }

// ================ Task 5 ================
// 5. Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // 20
        String categorize;
        if (age < 13 ){
            categorize = "Child";
            System.out.println("You are an: " + categorize);
        }else if (age <= 19){
            categorize = "Teenager";
            System.out.println("You are an: " + categorize);
        }else {
            categorize = "Adult";
            System.out.println("You are an: " + categorize);
        }

    }
}