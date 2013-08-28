package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionNegationShouldBe {
  @Test
  public void negativeWhenTheNumeratorIsNegative() {
    assertThat("-i/n = -(i/n)", new Fraction(-11, 10),
        is(equalTo(new Fraction(10,11).negate())));
  }
}
