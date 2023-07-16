package comp5911m.cwk1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Tests for COMP5911M Coursework 1, Task 3.
 *
 * @author Nick Efford
 */
public class ArrayCheckerTest {

  private int [] expected, correctArray1, correctArray2, shorterLength, longerLength, greaterThanMaxValue, outOfDeltaRange;
  private int maxValue, delta;

  @BeforeEach
  void setUp(){
    expected = new int[] {10, 50, 30, 98};
    correctArray1 =  new int[] {10, 50, 30, 98};
    correctArray2 =  new int[] {12, 55, 25, 94};
    shorterLength = new int [] {10, 50, 30};
    longerLength = new int[] {10, 50, 30, 98, 10};
    greaterThanMaxValue = new int[] {12, 55, 25, 101};
    outOfDeltaRange = new int[] {10, 56, 30, 92};
    maxValue = 100;
    delta = 5;
  }


  @Test
  public void testCheck() {

    ArrayChecker checker = new ArrayChecker(expected, maxValue, delta);

    assertFalse(checker.check(shorterLength));

    assertFalse(checker.check(longerLength));

    assertTrue(checker.check(correctArray1));

    assertFalse(checker.check(greaterThanMaxValue));

    assertTrue(checker.check(correctArray2));

    assertFalse(checker.check(outOfDeltaRange));
  }
}

