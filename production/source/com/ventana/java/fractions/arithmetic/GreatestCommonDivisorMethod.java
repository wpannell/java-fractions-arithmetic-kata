package com.ventana.java.fractions.arithmetic;

public class GreatestCommonDivisorMethod {
  public int gcdOf(int... factors) {
    if(factors[0] == 1 || factors[1] == 1) return 1;
    if(factors[0] == factors[1]) return factors[0];
    if(factors[1] % factors[0] == 0) return factors[0];
    return gcdOf(factors[1] % factors[0], factors[0]);
  }
}
