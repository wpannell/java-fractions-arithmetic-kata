package com.ventana.java.fractions.arithmetic;

import com.ventana.java.fractions.aithmetic.GreatestCommonDivisorMethod;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionsShouldBe {
  private static final int[] ZERO = new int[]{0, 1};

  private int[] fractions(final int numerator1, final int denominator1,
        final int numerator2, final int denominator2) {
    if(numerator1 == 0) return reduce(numerator2, denominator2);
    if(numerator2 == 0) return reduce(numerator1, denominator1);
    if(denominator1 == denominator2)
      return reduce(numerator1 + numerator2, denominator1);

    return reduce((numerator1*denominator2) + (numerator2*denominator1),
        denominator1 * denominator2);
  }

  private int[] reduce(final int numerator, final int denominator) {
    if(numerator == 0) return ZERO;
    final int gcd =
        new GreatestCommonDivisorMethod().gcdOf(numerator, denominator);
    return new int[]{numerator/gcd, denominator/gcd};
  }

  @Test
  public void zeroWhenTwoZeroFractionsAreAdded() {
    assertThat("fractions(0,9,0,10)", fractions(0,9,0,10), is(ZERO));
  }

  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat("fractions(0,100,1,99)",
        fractions(0,100,1,99), is(equalTo(new int[]{1,99})));

    assertThat("fractions(1,777,0,396)",
        fractions(1,777,0,396), is(equalTo(new int[]{1,777})));
  }

  @Test
  public void theSumOfTheNumeratorsWhenTheDenominatorsAreEqual() {
    assertThat("fractions(4,7,11,7)",
        fractions(4,7,11,7), is(equalTo(new int[]{15,7})));
  }

  @Test
  public void reducedWhenTheSumHasAGreatestCommonDivisor() {
    assertThat("fractions(10,20,30,20)",
        fractions(10,20,30,20), is(equalTo(new int[]{2,1})));
  }

  @Test
  public void crossMultipliedWhenTheDenominatorsAreUnequal() {
    assertThat("fractions(4,7,11,13)",
        fractions(4,7,11,13), is(equalTo(new int[]{129,91})));

    assertThat("fractions(5,10,10,10)",
        fractions(5,10,10,10), is(equalTo(new int[]{3,2})));

    assertThat("fractions(2,5,2,10)",
        fractions(2,5,2,10), is(equalTo(new int[]{3,5})));
  }
}
