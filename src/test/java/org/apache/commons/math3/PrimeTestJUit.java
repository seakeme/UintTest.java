package org.apache.commons.math3;

import org.junit.Test;

public class PrimeTestJUit {
    @Test
    public void test_isPrime(){
        int a = 2;
        System.out.println("isPrime：");
        System.out.println(a+" is "+ Primes.isPrime(a));
    }
    @Test
    public void test_nextPrime(){
        int c = 12;
        System.out.println("nextPrime：");
        System.out.println(c+" nextPrime is "+ Primes.nextPrime(c));

    }
    @Test
    public void test_primeFactors(){
        int d = 236;
        System.out.println("primeFactors：");
        System.out.println(d+" primeFactors is "+ Primes.primeFactors(d));
    }

}
