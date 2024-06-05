package Week5.Day1;

public class ArrayOperations {

    public static void main(String[] args) {

        //define integer array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + arrayToString(numbers));

        //function to reverse contents of the array
        reverse(numbers);
        System.out.println("Reversed Array: " + arrayToString(numbers));

        //function to calculate the average
        double average = findAverage(numbers);
        System.out.printf("Average of Array &.2f" + average);

    }

    /**
     * Function accepts an array and returns average the sum of the elements
     * @param array
     * @return double
     */
    public static double findAverage(int[] array){

        int sum = 0;
        for (int num : array){
            sum += num; //sum = sum + num
        }

        return (double) sum / array.length;

    }

    /**
     * Function accepts an int array, and returns the equivalent string.
     * @param array
     * @return String
     */
    public static String arrayToString(int[] array) {

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);

            if (i < array.length - 1) {
                sb.append(", ");

            }

        }

        sb.append("]");
        return sb.toString();

    }

    /**
     * Function to reverse the output of the array
     * @param array
     */
    public static void reverse (int[] array){

        int start = 0;
        int end = array.length - 1;

        while(start < end){

            int temp = array[start]; //10 - starting value
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }

    }

}
