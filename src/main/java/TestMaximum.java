
public class TestMaximum {
   public static void main(String[] args) {
   }

   //
   public Integer findMaximumIntegerNumber(Integer[] numberArray) {
      int maximumIntegerNumber;

      //Writing i outside because it can be accessible in whole function
      int i = 0;
      for(; i < numberArray.length - 1; i++) {

         //compareTo() returns value in form of 1, 0, -1
         maximumIntegerNumber = numberArray[i].compareTo(numberArray[i+1]);
         if(maximumIntegerNumber > 0 ) {
            break;
         }
      }
      return numberArray[i];
   }

   public Double findMaximumFloatNumber(Double[] numberArray) {
      int maximumDoubleNumber;

      //Writing i outside because it can be accessible in whole function
      int i = 0;
      for(; i < numberArray.length - 1; i++) {

         //compareTo() returns value in form of 1, 0, -1
         maximumDoubleNumber = numberArray[i].compareTo(numberArray[i+1]);
         if(maximumDoubleNumber > 0 ) {
            break;
         }
      }
      return numberArray[i];
   }
}
