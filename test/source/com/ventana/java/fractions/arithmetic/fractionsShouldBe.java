package com.ventana.java.fractions.arithmetic;

import com.ventana.java.fractions.aithmetic.GreatestCommonDivisorMethod;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class fractionsShouldBe {
  private static final int[] ZERO = new int[]{0, 1};

  private int[] fractions(int numerator1, int denominator1,
        int numerator2, int denominator2) {
    if(numerator1 == 0 && numerator2 == 0) return ZERO;
    if(numerator1 == 0) return reduce(numerator2, denominator2);
    if(numerator2 == 0) return reduce(numerator1, denominator1);
    return ZERO;
  }

  private int[] reduce(int numerator, int denominator) {
    final int gcd =
        new GreatestCommonDivisorMethod().gcdOf(numerator, denominator);
    return new int[]{numerator/gcd, denominator/gcd};
  }

  @Test
  public void zeroWhenTwoZeroFractionsAreAdded() {
    assertThat(fractions(0,9,0,10), is(ZERO));
  }

  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat(fractions(0,100,1,99), is(equalTo(new int[]{1,99})));
    assertThat(fractions(1,777, 0,396), is(equalTo(new int[]{1,777})));
  }
}
