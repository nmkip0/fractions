package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReduceFractionTest {

    @Test
    public void alreadyInLowestTerms() {
        assertEquals(new Fraction(3,4), new Fraction(3, 4));
    }

    @Test
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3,4), new Fraction(6, 8));
    }
}
