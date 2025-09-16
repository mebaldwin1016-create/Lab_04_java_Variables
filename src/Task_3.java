public class Task_3
{

    public static void main(String[] args)
    {
        double creditBalance = 5000;
        double interestRate = .17;
        double monthlyInterest = 0;
        double newBalance = 0;
        double secondMonthlyInterest = 0;
        double secondNewBalance = 0;

        System.out.println("The credit balance is: " + creditBalance);
        System.out.println("The interest rate is: " + interestRate);

        monthlyInterest = creditBalance * interestRate;

        System.out.println("The interest for the first month is: " + monthlyInterest);

        newBalance = creditBalance + monthlyInterest;

        System.out.println("The new credit balance is: " + newBalance);

        secondMonthlyInterest = newBalance * interestRate;

        System.out.println("The interest for the second month is: " + secondMonthlyInterest);

        secondNewBalance = newBalance + secondMonthlyInterest;

        System.out.println("The second new balance is: " + secondNewBalance);
    }
}
