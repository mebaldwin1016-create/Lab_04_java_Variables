public class Part_1
{

    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 15;
        int intProduct = 24;
        int intDifference = 2;
        int intQuotient = 22;
        int intModulo = 34;

        double doubleOperandA = 3.50;
        double doubleOperandB = 2.25;
        double doubleSum = 5.75;
        double doubleProduct = 9.25;
        double doubleDifference = 1.25;
        double doubleQuotient = 51.50;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandB - intOperandA;
        System.out.println("The difference using ints of " + intOperandB + " and " + intOperandA + " is " + intDifference);
        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient using ints of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
        intModulo = intOperandB % intOperandA;
        System. out.println("The remainder using ints of " + intOperandB + " and " + intOperandA + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The difference using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
        doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The quotient using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient);
    }
}
