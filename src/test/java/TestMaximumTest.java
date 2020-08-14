import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {

   //This method contains Assertion and compareTo() Calling For Integer Values
   public void assertMethod(Integer[] elementsArray) {
      TestMaximum testMaximum = new TestMaximum(elementsArray);
      Comparable maximumNumber = testMaximum.findMaxElement(elementsArray);
      Assert.assertEquals(4, maximumNumber);
   }

   //This method contains Assertion and compareTo() Calling For Double Values
   public void assertFloatMethod(Double[] elementsArray) {
      TestMaximum testMaximum = new TestMaximum(elementsArray);
      Comparable maximumNumber = testMaximum.findMaxElement(elementsArray);
      Assert.assertEquals(4.0, (Double) maximumNumber,0);
   }

   private void assertStringMethod(String[] elementsArray) {
      TestMaximum testMaximum = new TestMaximum(elementsArray);
      Comparable maximumString = testMaximum.findMaxElement(elementsArray);
      Assert.assertEquals("tiger", maximumString);
   }

   //Testing maximum number at 1st position
   @Test
   public void numberAt1st_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {4, 3, 1, 2};
      assertMethod(numberArray);
   }

   //Testing maximum number at 2nd position
   @Test
   public void numberAt2nd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {3, 4, 1, 3};
      assertMethod(numberArray);
   }

   //Testing maximum number at 3rd position
   @Test
   public void numberAt3rd_Method_Should_Return_MaximumNumber() {
      Integer[] numberArray = {1, 2, 4, 0};
      assertMethod(numberArray);
   }

   //Testing Maximum Float number at 1st position
   @Test
   public void floatNumberAt1st_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {4.0, 1.1, 2.3, 3.4};
      assertFloatMethod(numberArray);
   }

   //Testing Maximum Float number at 2nd position
   @Test
   public void floatNumberAt2nd_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {1.1, 4.0, 2.2, 3.7};
      assertFloatMethod(numberArray);
   }

   //Testing Maximum Float number at 3rd position
   @Test
   public void floatNumberAt3rd_Position_Method_Should_Return_MaximumNumber() {
      Double[] numberArray = {1.7, 2.9, 4.0, 3.2};
      assertFloatMethod(numberArray);
   }

   //Testing Maximum String At 1St Position
   @Test
   public void stringAt1st_Position_Method_Should_Return_Max_String() {
      String[] stringArray = {"Monkey", "Lion", "Horse", "tiger"};
      assertStringMethod(stringArray);
   }

   //Testing Maximum String At 2nd Position
   @Test
   public void stringAt2nd_Position_Method_Should_Return_Max_String() {
      String[] stringArray = {"Lion", "Monkey", "Horse", "tiger"};
      assertStringMethod(stringArray);
   }

   //Testing Maximum String At 3rd Position
   @Test
   public void stringAt3rd_Position_Method_Should_Return_Max_String() {
      String[] stringArray = {"Lion", "Horse", "tiger", "Monkey"};
      assertStringMethod(stringArray);
   }
}