package com.ventana.java.fractions.arithmetic;

public class Fraction {
  public static final Fraction ZERO = new Fraction(0,1);
  public final int numerator;
  public final int denominator;
  public final int numeratorNorm;
  public final int denominatorNorm;

  public Fraction(final int numerator, final int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    this.numeratorNorm = normalize(numerator,denominator)[0];
    this.denominatorNorm = normalize(numerator,denominator)[1];
  }

  public Fraction minus(final Fraction fraction) {
    return this.plus(fraction.negate());
  }

  public Fraction negate() {
    return new Fraction(-numeratorNorm, denominatorNorm);
  }

  public Fraction plus(final Fraction fraction) {
    if(fraction.numerator == 0) return reduce(this);
    if(numerator == 0) return reduce(fraction);
    if(denominator == fraction.denominator)
      return reduce(new Fraction(numerator + fraction.numerator, denominator));

    return reduce(new Fraction(
        (numerator * fraction.denominator) + (fraction.numerator * denominator), denominator * fraction.denominator));
  }

  public Fraction times(Fraction fraction) {
    return reduce(new Fraction(numeratorNorm *fraction.numeratorNorm,
        denominatorNorm*fraction.denominatorNorm));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Fraction fraction = (Fraction) o;

    if (denominatorNorm != fraction.denominatorNorm) return false;
    if (numeratorNorm != fraction.numeratorNorm) return false;

    return true;
  }

  @Override
  public String toString() {
    return numerator + " / " + denominator ;
  }

  private int[] normalize(final int numerator, final int denominator) {
    if(numerator == 0) return new int[]{0,1};

    if(numerator < 0 &&  denominator < 0)
        return new int[]{-numerator, -denominator};

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
