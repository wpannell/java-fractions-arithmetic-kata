package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionAdditionShouldBe {
  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat("0/100 + 1/199 = 1/199)",
        new Fraction(0,100).plus(new Fraction(1,199)),
        is(new Fraction(1,199)));

    assertThat("1/199 + 0/100 = 1/199)",
        new Fraction(1,199).plus(new Fraction(0, 100)),
        is(new Fraction(1,199)));
  }

  @Test
  public void theSumOfTheNumeratorsWhenTheDenominatorsAreEqual() {
    assertThat("4/7 + 11/7 = 15/7)",
        new Fraction(4, 7).plus(new Fraction(11, 7)),
        is(new Fraction(15, 7)));
  }

  @Test
  public void reducedWhenTheSumHasAGreatestCommonDivisor() {
    assertThat("10/20 + 30/20 = 2/1)",
        new Fraction(10, 20).plus(new Fraction(30, 20)),
        is(new Fraction(2, 1)));
  }

  @Test
  public void crossMultipliedAndAddedWhenTheDenominatorsAreUnequal() {
    assertThat("4/7 + 11/13 = 129/91)",
        new Fraction(4, 7).plus(new Fraction(11, 13)),
        is(new Fraction(129, 91)));

    assertThat("5/10 + 10/10 = 3/2)",
        new Fraction(5, 10).plus(new Fraction(10, 10)),
        is(new Fraction(3, 2)));

    assertThat("2/5 + 2/10 = 3/5)",
        new Fraction(2, 5).plus(new Fraction(2, 10)),
        is(new Fraction(3, 5)));
  }
}
