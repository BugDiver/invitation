package com.invitation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void testShouldGiveTheFormattedNameAccordingToOption() {
        Name name = new Name("Vedas" ,"Khmer");
        assertEquals(name.getFormattedName("firstNameFirst") ,"Vedas Khmer");
        assertEquals(name.getFormattedName("lastNameFirst") ,"Khmer, Vedas");

    }
}
