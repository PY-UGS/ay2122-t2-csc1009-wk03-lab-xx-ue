import java.lang.Math;
public class Loan {
    private double annualInterestRate=2.5;
    private int numberOfyears=1;
    private double loanAmount=1000;
    private java.util.Date date;
//    private double monthlyPayment;
//    private double monthlyInterestRate;
//    private int numberOfYears;
//    private double totalPayment;


    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public int getNumberOfyears(){
        return numberOfyears;
    }
    public void setNumberOfyears(int numberOfyears){
        this.numberOfyears=numberOfyears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public java.util.Date getLoanDate(){
        java.util.Date date=new java.util.Date();
        return date;
    }
    public double getMonthlyPayment(){
        double monthlyPayment=0;
        monthlyPayment=(loanAmount*(annualInterestRate/1200))/(1-(1/Math.pow((1+(annualInterestRate/1200)),(numberOfyears*12))));
        //this.monthlyPayment=monthlyPayment;
        monthlyPayment=Math.round(monthlyPayment * 100.0) / 100.0;
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=0;
        totalPayment=(loanAmount*(annualInterestRate/1200))/(1-(1/Math.pow((1+(annualInterestRate/1200)),(numberOfyears*12))))*numberOfyears*12;
        totalPayment=Math.round(totalPayment * 100.0) / 100.0;
        return totalPayment;
    }
}
