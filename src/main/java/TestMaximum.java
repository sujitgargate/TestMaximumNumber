public class TestMaximum <E extends  Comparable> {
   E elementsArray[];

   public TestMaximum(E [] elementsArray) {
      this.elementsArray = elementsArray;
   }

   public static void main(String[] args) {

      Integer[] integerArray = {12, 33, 656, 1112};
      Double[] floatArray = {71.1, 52.12, 34.5, 110.0};
      String[] stringArray = {"Apple", "Orange", "Berry", "Cherry"};

      new TestMaximum(integerArray).findMaxElement(integerArray);
      new TestMaximum(floatArray).findMaxElement(floatArray);
      new TestMaximum(stringArray).findMaxElement(stringArray);
   }

   //Finding Maximum element using generics
   public <E extends Comparable> E findMaxElement(E [] array) {
      E maxElement = array[0];
         for (E element : array) {
            if (element.compareTo(maxElement) > 0) {
               maxElement = element;
            }
         }
      printMaximumElement(maxElement);
      return maxElement;
      }

      //For
   public <E> void printMaximumElement(E maximumElement) {
      System.out.println("Maximum in "+ maximumElement.getClass().getSimpleName() +" is "+ maximumElement);
   }
}