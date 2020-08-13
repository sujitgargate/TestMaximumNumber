
public class TestMaximum {
   public static void main(String[] args) {
   }

   //
   public Integer findMaximumNumber(Integer[] numberArray) {
      int maximumNumber;

      //Writing i outside because it can be accessible in whole function
      int i = 0;
      for(; i < numberArray.length - 1; i++) {

         //compareTo() returns value in form of 1, 0, -1
         maximumNumber = numberArray[i].compareTo(numberArray[i+1]);
         if(maximumNumber > 0 ) {
            break;
         }
      }
      return numberArray[i];
   }
}
