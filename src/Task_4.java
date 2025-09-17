public class Task_4
{

    public static void main(String[] args)
    {
        int examineNumber = 7;
        int numToExamine = 2;
        int examineNum = 8;
        int intModulo = 0;

        intModulo = examineNumber % numToExamine;
        System.out.println(intModulo + " is an odd number");

        intModulo = examineNum % numToExamine;
        System.out.println(intModulo + " is an even number");

    }
}
