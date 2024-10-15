
public class array {

    public static void main(String[] args) {
        // single dimension array
        int arr[] = new int[5];
        // populating the array with the random values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10); // typcasting
        }

        // Printing the array with random values
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // 2d array
        int multiArr[][] = new int[4][3];

        // populating the array with the random values
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                multiArr[i][j] = (int) (Math.random() * 10);
            }
        }

        // Printing the multiArr
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
