
public class conditionals {
    public static void main(String[] args) {
        // conditionals if and else
        int number = 2;
        String result;

        if (number % 2 == 0) { // check for even or odd number
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // we can do the sam by using ternary operator

        result = (number % 2 == 0) ? "The number is even" : "The number is odd";

        System.out.println("Result using ternary operator" + " " + result);

        // Switch statement in JAVA

        int numberofDay = 7;
        
        switch (numberofDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            System.out.println("A weak contains only 7 days");
                break;
        }

    }
}
