import java.util.Scanner;
public class Lab3q1 {

    public static void main(String[] arg){

        Loan new_loan = new Loan();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double AnnualInterestRate = input.nextDouble();
        System.out.println("Enter number of years as an integer:");
        int NumberOfyears = input.nextInt();
        System.out.println("Enter loan amount, for example,12000.95:");
        double LoanAmount = input.nextDouble();

        new_loan.setAnnualInterestRate(AnnualInterestRate);
        new_loan.getAnnualInterestRate();

        new_loan.setNumberOfyears(NumberOfyears);
        new_loan.getNumberOfyears();

        new_loan.setLoanAmount(LoanAmount);
        new_loan.getLoanAmount();

        System.out.println("Created on "+new_loan.getLoanDate());
        System.out.println("The monthly payment is "+new_loan.getMonthlyPayment());
        System.out.println("The total payment is "+new_loan.getTotalPayment());
        //date=new java.util.Date();

    }
}