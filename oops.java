import java.util.Scanner;

/**
 * Calculator
 */
class calculator {
    public int add(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}

// Learning oops in java
public class oops {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Taking input from the user
        System.out.println("Enter the two numbers which you want to add");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        calculator calc = new calculator();
        int sum = calc.add(num1, num2);
        System.out.println("The sum of the two numbers is " + sum);

    }
}
