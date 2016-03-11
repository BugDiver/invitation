package com.invitation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenderTest {
    @Test
    public void testGenderShouldGaePrefixAccordingly() {
        Gender g = new Gender("female");
        assertEquals(g.getPrefix(), "Ms.");
        Gender male = new Gender("Male");
        assertEquals(male.getPrefix(),"Mr.");
    }
}
