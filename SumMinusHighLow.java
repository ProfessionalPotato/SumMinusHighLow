import java.util.Arrays;

public class SumMinusHighLow
{
   public static int sum(int[] numbers) {
      
      // if array is empty or has 2 elements or less, return 0
      if (numbers == null || numbers.length <= 2) return 0;
      
      // declare new integer to hold sum of the numbers
      int sum = 0;
      
      // sorts the array into ascending order
      Arrays.sort(numbers);
      
      // iterate through the array adding the next number with each loop
      // starts at index 1 and loops till i is 1 less than length of the array to skip lowest and highest number
      for (int i = 1; i < numbers.length - 1; i++){
         sum += numbers[i];   
      }
      
      // returns the resulting sum
      return sum;
   }
   
}