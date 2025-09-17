public class Task_2
{
    public static void main(String[] args)
    {
        double winterCost = 200;
        double springCost = 200;
        double summerCost = 200;
        double fallCost = 200;
        double totalCost = 0;

        System.out.println("The winter cost is: " + winterCost);
        System.out.println("The spring cost is: " + springCost);
        System.out.println("The summer cost is: " + summerCost);
        System.out.println("The fall cost is: " + fallCost);

        totalCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("The total yearly maintenance cost is: " + totalCost);
    }
}
