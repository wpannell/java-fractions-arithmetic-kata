package com.ventana.java.fractions.arithmetic;

public class Fraction {
  public static final Fraction ZERO = new Fraction(0,1);
  public final int numerator;
  public final int denominator;

  public Fraction(final int numerator, final int denominator) {
    if(denominator == 0 ) throw new RuntimeException("undefined fraction");
    this.numerator = normalize(numerator,denominator)[0];
    this.denominator = normalize(numerator,denominator)[1];;
  }

  public Fraction dividedBy(Fraction fraction) {
    if(fraction.equals(ZERO)) throw new ArithmeticException("DivideByZero");
    return reduce(new Fraction(numerator * fraction.denominator,
        denominator * fraction.numerator));
  }

  public Fraction minus(final Fraction fraction) {
    return this.plus(fraction.negate());
  }

  public Fraction negate() {
    return new Fraction(-numerator, denominator);
  }

  public Fraction plus(final Fraction fraction) {
    return reduce(new Fraction(
        (numerator * fraction.denominator) + (fraction.numerator * denominator),
        denominator * fraction.denominator));
  }

  public Fraction times(Fraction fraction) {
    return reduce(new Fraction(numerator *fraction.numerator,
        denominator*fraction.denominator));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Fraction fraction = (Fraction) o;

    if (denominator != fraction.denominator) return false;
    if (numerator != fraction.numerator) return false;

    return true;
  }

  @Override
  public String toString() {
    return numerator + " / " + denominator ;
  }

  private int[] normalize(final int numerator, final int denominator) {
    if(numerator == 0) return new int[]{0,1};
    if(denominator < 0) return new int[]{-numerator, -denominator};
    return new int[]{numerator, denominator};
  }

  private Fraction reduce(final Fraction fraction) {
    if(fraction.numerator == 0) return ZERO;
    final int gcd =
        new GreatestCommonDivisorMethod().gcdOf(fraction.numerator, fraction.denominator);
    return new Fraction(fraction.numerator /gcd, fraction.denominator /gcd);
  }
}
