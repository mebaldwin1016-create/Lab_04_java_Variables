public class Task_1
{

    public static void main(String[] args)
    {
        double purchasePrice = 86;
        double taxRate = .05;
        double salesTax = 0;

        System.out.println("Purchase Price: " + purchasePrice);
        System.out.println("Tax Rate: " + taxRate);

        salesTax = taxRate * purchasePrice;

        System.out.println("Sales Tax: " + salesTax);
    }
}
