import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Taking input from the user
        System.out.println("How many numbers you want to print starting from 1");
        int n = s.nextInt();
        int i = 1;


        // while loop in java
        while (i<=n) {
            System.out.println(i);
            i++;
        }

        // for loop : Doing the same thing using a for loop
        for (int j = 0; j < n; j++) {
            System.out.println("Hi this segment is using for loop :" + j);
        }

    }

}
