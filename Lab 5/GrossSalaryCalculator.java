/*2. Write a program to calculate the gross salary of a group of employees. Basic salary should be taken from the user. If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, else HRA=3000 and DA 70% will be given to the employee. Note:Input of basic salary will be taken from the keyboard. After calculating the salary of one employee, the program will ask for the user's choice as int. If “-1” is entered then the loop will continue and the loop will exit for other int inputs.*/ 



import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();

            double hra, da, gross;

            if (basic > 15000) {
                hra = 0.20 * basic;
                da = 0.60 * basic;
            } else {
                hra = 3000;
                da = 0.70 * basic;
            }

            gross = basic + hra + da;
            System.out.println("Gross Salary = ₹" + gross);

            System.out.print("Enter -1 to continue or any other number to exit: ");
            choice = sc.nextInt();

        } while (choice == -1);

        sc.close();
    }
}
