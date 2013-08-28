package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionAdditionShouldBe {
  private static final Fraction zeroOver9 = new Fraction(0, 9);
  private static final Fraction zeroOver10 = new Fraction(0, 10);
  private static final Fraction zeroOver100 = new Fraction(0,100);
  private static final Fraction oneOver199 = new Fraction(1,199);
  private static final Fraction fourOver7 = new Fraction(4, 7);
  private static final Fraction elevenOver7 = new Fraction(11, 7);
  private static final Fraction fifteenOver7 = new Fraction(15, 7);
  private static final Fraction tenOver20 = new Fraction(10, 20);
  private static final Fraction thirtyOver20 = new Fraction(30, 20);
  private static final Fraction twoOver1 = new Fraction(2, 1);
  private static final Fraction elevenOver13 = new Fraction(11, 13);
  private static final Fraction oneTwentyNineOver91 = new Fraction(129, 91);
  private static final Fraction fiveOver10 = new Fraction(5, 10);
  private static final Fraction tenOver10 = new Fraction(10, 10);
  private static final Fraction threeOver2 = new Fraction(3, 2);
  private static final Fraction twoOver5 = new Fraction(2, 5);
  private static final Fraction twoOver10 = new Fraction(2, 10);
  private static final Fraction threeOver5 = new Fraction(3, 5);

  @Test
  public void zeroWhenTwoZeroFractionsAreAdded() {
    assertThat("0/9 + 0/10)", zeroOver9.plus(zeroOver10), is(Fraction.ZERO));
  }

  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat("0/100 + 1/199)", zeroOver100.plus(oneOver199), is(oneOver199));
    assertThat("1/199 + 0/100)", oneOver199.plus(zeroOver100), is(oneOver199));
  }

  @Test
  public void theSumOfTheNumeratorsWhenTheDenominatorsAreEqual() {
    assertThat("4/7 + 11/7)", fourOver7.plus(elevenOver7), is(fifteenOver7));
  }

  @Test
  public void reducedWhenTheSumHasAGreatestCommonDivisor() {
    assertThat("10/20 + 30/20)", tenOver20.plus(thirtyOver20), is(twoOver1));
  }

  @Test
  public void crossMultipliedWhenTheDenominatorsAreUnequal() {
    assertThat("4/7 + 11/13)", fourOver7.plus(elevenOver13),
        is(oneTwentyNineOver91));

    assertThat("5/10 + 10/10)", fiveOver10.plus(tenOver10), is(threeOver2));
    assertThat("2/5 + 2/10)", twoOver5.plus(twoOver10), is(threeOver5));
  }
}
