package com.ventana.java.fractions.arithmetic;

public class Fraction {
  public static final Fraction ZERO = new Fraction(0,1);
  public final int numerator;
  public final int denominator;

  public Fraction(final int numerator, final int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction plus(final Fraction fraction) {
    if(fraction.numerator == 0) return reduce(this);
    if(numerator == 0) return reduce(fraction);
    if(denominator == fraction.denominator)
      return reduce(new Fraction(numerator + fraction.numerator, denominator));

    return reduce(new Fraction(
        (numerator * fraction.denominator) + (fraction.numerator * denominator), denominator * fraction.denominator));
  }

  @Override
  public String toString() {
    return numerator + " / " + denominator ;
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

  private Fraction reduce(final Fraction fraction) {
    if(fraction.numerator == 0) return ZERO;
    final int gcd =
        new GreatestCommonDivisorMethod().gcdOf(fraction.numerator, fraction.denominator);
    return new Fraction(fraction.numerator /gcd, fraction.denominator /gcd);
  }
}
