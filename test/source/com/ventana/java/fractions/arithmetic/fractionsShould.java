package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class fractionsShould {
  private int fractions(int... nums) {
    return 0;
  }

  @Test
  public void addTwoZeroesAndGetZero() {
    assertThat(fractions(0,9,0,10), is(equalTo(0)));
  }
}
