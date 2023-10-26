import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void customReverseInPlace() {
    int[] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {4, 3, 2, 1}, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void customReversed(){
    int[] input1 = {1, 2, 3};
    int[] newArr = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[] {3, 2, 1}, newArr);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {2, 2, 3, 4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
