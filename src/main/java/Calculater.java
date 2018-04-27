import java.util.Scanner;

/**
 * Created by Danil at 25/04/2018
 * */


public class Calculater {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double b = scanner.nextDouble();
        System.out.println("Enter the operation:");
        String operation = scanner.next();

        double result = 0;

        switch (operation){
            case "+":
                result = sum(a,b);
                System.out.format("Result of sum: %.4f%n",result);
                break;

            case "-":
                result = difference(a,b);
                System.out.format("Result of difference: %.4f%n",result);
                break;

            case "/":
                result = division(a,b);
                System.out.format("Result of division: %.4f%n",result);
                break;

            case "*":
                result = increase(a,b);
                System.out.format("Result of increase: %.4f%n",result);
                break;

            default:
                System.out.println("No operation is provided");
                break;
        }


    }

    /**
     * Return result of summary
     * @param a double fist term
     * @param b double second term
     * @return double result of summary
     * */
    public static double sum(double a, double b)
    {
        return a+b;
    }

    /**
     * Return result of difference
     * @param a double minuend
     * @param b double subtrahend
     * @return double result of difference
     * */
    public static double difference(double a, double b)
    {
        return a-b;
    }
    /**
     * return result of division
     * @param a double dividend
     * @param b double divider
     * @return double result of division
     * */
    public static double division(double a, double b)
    {
        return a/b;
    }

    /**
     * return result of increase
     * @param a double fist multiplier
     * @param b double second multiplier
     * @return double result of increase
     * */
    public static double increase(double a, double b)
    {
        return a*b;
    }
}
