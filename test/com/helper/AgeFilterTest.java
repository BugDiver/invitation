package com.helper;

import com.invitation.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeFilterTest {
    @Test
    public void testAgeFilterShouldCheckIfTheGivenPersonIsAboveThanConstraintAge() {
        AgeFilter ageFilter = new AgeFilter();
        ageFilter.addConstraint("20");
        Name name = new Name("Julius" ,"Barrows"){};
        Gender gender = new Gender("Female"){};
        Age age = new Age(28);
        Address address = new Address("Veda haven" ,"Vermont" ,",Macedonia"){};
        Person person = new Person(name ,gender ,age ,address);
        assertEquals(true, ageFilter.check(person));
        assertEquals(ageFilter.getConstraint(person) ,"28");
    }
}
