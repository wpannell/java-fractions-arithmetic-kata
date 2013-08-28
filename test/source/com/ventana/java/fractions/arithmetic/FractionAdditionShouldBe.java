package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionAdditionShouldBe {
  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat("0/100 + 1/199)", TestData.zeroOver100.plus(TestData.oneOver199),
        is(TestData.oneOver199));

    assertThat("1/199 + 0/100)", TestData.oneOver199.plus(TestData.zeroOver100),
        is(TestData.oneOver199));
  }

  @Test
  public void theSumOfTheNumeratorsWhenTheDenominatorsAreEqual() {
    assertThat("4/7 + 11/7)", TestData.fourOver7.plus(TestData.elevenOver7),
        is(TestData.fifteenOver7));
  }

  @Test
  public void reducedWhenTheSumHasAGreatestCommonDivisor() {
    assertThat("10/20 + 30/20)", TestData.tenOver20.plus(TestData.thirtyOver20),
        is(TestData.twoOver1));
  }

  @Test
  public void crossMultipliedWhenTheDenominatorsAreUnequal() {
    assertThat("4/7 + 11/13)", TestData.fourOver7.plus(TestData.elevenOver13),
        is(TestData.oneTwentyNineOver91));

    assertThat("5/10 + 10/10)", TestData.fiveOver10.plus(TestData.tenOver10),
        is(TestData.threeOver2));

    assertThat("2/5 + 2/10)", TestData.twoOver5.plus(TestData.twoOver10),
        is(TestData.threeOver5));
  }
}
