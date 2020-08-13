import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {

   //This method contains Assertion and compareTo() Calling For Integer Values
   public void assertMethod(Integer[] numberArray) {
      TestMaximum testMaximum = new TestMaximum();
      int maximumNumber = testMaximum.findMaximumIntegerNumber(numberArray);
      Assert.assertEquals(4, maximumNumber);
   }

   //This method contains Assertion and compareTo() Calling For Double Values
   public void assertFloatMethod(Double[] numberArray) {
      TestMaximum testMaximum = new TestMaximum();
      double maximumNumber = testMaximum.findMaximumFloatNumber(numberArray);
      Assert.assertEquals(4.0, maximumNumber,0);
   }

   //Testing maximum number at 1st position
   @Test
   public void numberAt1st_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {4,3,1};
      assertMethod(numberArray);
   }

   //Testing maximum number at 2nd position
   @Test
   public void numberAt2nd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {3,4,1};
      assertMethod(numberArray);
   }

   //Testing maximum number at 3rd position
   @Test
   public void numberAt3rd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {1,2,4};
      assertMethod(numberArray);
   }

   //Testing maximum Float number at 1st position
   @Test
   public void floatNumberAt1st_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {4.0, 1.1, 2.3};
      assertFloatMethod(numberArray);
   }

   //Testing maximum Float number at 2nd position
   @Test
   public void floatNumberAt2nd_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {1.1,4.0,2.2};
      assertFloatMethod(numberArray);
   }

   //Testing maximum Float number at 3rd position
   @Test
   public void floatNumberAt3rd_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {1.7,2.9,4.0};
      assertFloatMethod(numberArray);
   }
}