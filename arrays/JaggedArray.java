public class JaggedArray {

    public static void main(String[] args)
  {

        int[][] matrix = new int[10][];
        int number = 1;

        // Create the jagged array
        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = new int[i + 1];

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = number;
                number++;
            }
        }

        // Display the jagged array
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
