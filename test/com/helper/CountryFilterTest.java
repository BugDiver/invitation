package com.helper;

import com.invitation.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryFilterTest {
    @Test
    public void testCountryFilterShouldCheckIfTheGivenPersonBelongFromConstraintCountry() {
        CountryFilter countryFilter = new CountryFilter();
        countryFilter.addConstraint("Macedonia");

        Name name = new Name("Julius" ,"Barrows"){};
        Gender gender = new Gender("Female"){};
        Age age = new Age(28){};
        Address address = new Address("Veda haven" ,"Vermont" ,"Macedonia");
        Person person = new Person(name ,gender ,age ,address);

        assertTrue(countryFilter.check(person));
        assertEquals(countryFilter.getConstraint(person) ,"Macedonia");
    }

}
