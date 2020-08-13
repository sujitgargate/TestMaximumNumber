import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {

   //This method contains Assertion and compareTo() calling
   public void assertMethod(Integer[] numberArray) {
      TestMaximum testMaximum = new TestMaximum();
      int maximumNumber = testMaximum.findMaximumNumber(numberArray);
      Assert.assertEquals(4, maximumNumber);
   }

   //Testing maximum number at 1st position
   @Test
   public void numberAt1st_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {4,3,1};
      assertMethod(numberArray);
   }

   //Testing maximum number at 1st position
   @Test
   public void numberAt2nd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {3,4,1};
      assertMethod(numberArray);
   }

   //Testing maximum number at 1st position
   @Test
   public void numberAt3rd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {1,2,4};
      assertMethod(numberArray);
   }
}
