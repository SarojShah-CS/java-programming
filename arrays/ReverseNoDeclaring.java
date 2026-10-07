public class ReverseNoDeclaring
{
    public static void main(String[] args)
  {

        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};

        // Reverse the array within the same array
        for (int i = 0; i < myArray.length / 2; i++)
        {

            double temp = myArray[i];

            myArray[i] = myArray[myArray.length - 1 - i];

            myArray[myArray.length - 1 - i] = temp;
        }

        // Display the reversed array
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
    }
}
