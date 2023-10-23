package org.apache.commons.math3;
public class PrimeTest {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("isPrime：");
        System.out.println(a+" is "+ Primes.isPrime(a));
        int b = 1;
        System.out.println(b+" is "+ Primes.isPrime(b));
        System.out.println("nextPrime：");
        int c = 12;
        System.out.println(c+" nextPrime is "+ Primes.nextPrime(c));
        System.out.println("primeFactors：");
        int d = 236;
        System.out.println(d+" primeFactors is "+ Primes.primeFactors(d));
    }
}
