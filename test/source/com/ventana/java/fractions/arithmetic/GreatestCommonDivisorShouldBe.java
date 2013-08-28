package com.ventana.java.fractions.arithmetic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorShouldBe {
  private GreatestCommonDivisorMethod method;

  @Before
  public void aNewMethodObject() {
    method = new GreatestCommonDivisorMethod();
  }

  @Test
  public void oneWhenAnyFactorIs1() {
    assertThat("gcdOf(1, 99)", method.gcdOf(1, 99), is(equalTo(1)));
    assertThat("gcdOf(199, 1)", method.gcdOf(199, 1), is(equalTo(1)));
  }

  @Test
  public void theFactorWhenBothFactorsAreEqual() {
    assertThat("gcdOf(199, 199)", method.gcdOf(199, 199), is(equalTo(199)));
  }

  @Test
  public void oneWhenFactorsAre2AndAnyOddNumber() throws Exception {
    assertThat("gcdOf(2, 101)", method.gcdOf(2, 101), is(equalTo(1)));
    assertThat("gcdOf(1771, 2)", method.gcdOf(1771, 2), is(equalTo(1)));
  }

  @Test
  public void twoWhenFactorsAre2And4() throws Exception {
    assertThat("gcdOf(2, 4)", method.gcdOf(2, 4), is(equalTo(2)));
    assertThat("gcdOf(4, 2)", method.gcdOf(4, 2), is(equalTo(2)));
  }

  @Test
  public void threeWhenFactorsAre3And9() throws Exception {
    assertThat("gcdOf(3, 9)", method.gcdOf(3, 9), is(equalTo(3)));
    assertThat("gcdOf(9, 3)", method.gcdOf(9, 3), is(equalTo(3)));
  }

  @Test
  public void twelveWhenFactorsAre12And144() throws Exception {
    assertThat("gcdOf(12, 144)", method.gcdOf(12, 144), is(equalTo(12)));
    assertThat("gcdOf(144, 12)", method.gcdOf(144, 12), is(equalTo(12)));
  }

  @Test
  public void threeWhenFactorsAre12And147() throws Exception {
    assertThat("gcdOf(12, 147)", method.gcdOf(12, 147), is(equalTo(3)));
    assertThat("gcdOf(147, 12)", method.gcdOf(147, 12), is(equalTo(3)));
  }

  @Test
  public void fourWhenFactorsAre12And148() throws Exception {
    assertThat("gcdOf(12, 148)", method.gcdOf(12, 148), is(equalTo(4)));
    assertThat("gcdOf(148, 12)", method.gcdOf(148, 12), is(equalTo(4)));
  }

  @Test
  public void sixWhenFactorsAre12And150() throws Exception {
    assertThat("gcdOf(12, 150)", method.gcdOf(12, 150), is(equalTo(6)));
    assertThat("gcdOf(150, 12)", method.gcdOf(150, 12), is(equalTo(6)));
  }
}
