package comp5911m.cwk1;

import java.util.Arrays;


/**
 * Class for COMP5911M Coursework 1, Task 3.
 *
 * @author Nick Efford
 */
public class ArrayChecker {
  private int[] expected;
  private int max;
  private int delta;

  public ArrayChecker(int[] exp, int max, int delta) {
    expected = Arrays.copyOf(exp, exp.length);
    this.max = max;
    this.delta = delta;
  }

  public boolean check(int[] array) {

    if (array.length != expected.length) {
      return false;
    }

    for (int value= 0; value < array.length; ++value ) {

      if ((array[value] < 0 || array[value] > max) || (Math.abs(expected[value] - array[value]) > delta)){
        return false;
      }
    }

    return true;
  }
}
