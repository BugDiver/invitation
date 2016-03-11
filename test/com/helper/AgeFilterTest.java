package com.helper;

import com.invitation.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeFilterTest {
    @Test
    public void testAgeFilterShouldCheckIfTheGivenPersonIsAvobeThanConstraintAge() {
        AgeFilter ageFilter = new AgeFilter();
        ageFilter.addConstraint("20");
        String details = "Julius,Barrows,Female,28,Veda haven,Vermont,Macedonia";
        Person person = new Person(details.split(","));
        assertTrue(ageFilter.check(person));
        assertEquals(ageFilter.getConstraint(person) ,"28");
    }
}
