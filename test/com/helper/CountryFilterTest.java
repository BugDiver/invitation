package com.helper;

import com.invitation.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryFilterTest {
    @Test
    public void testCountryFilterShouldCheckIfTheGivenPersonBelongFromConstraintCountry() {
        CountryFilter countryFilter = new CountryFilter();
        countryFilter.addConstraint("Macedonia");
        String details = "Julius,Barrows,Female,28,Veda haven,Vermont,Macedonia";
        Person person = new Person(details.split(","));
        assertTrue(countryFilter.check(person));
        assertEquals(countryFilter.getConstraint(person) ,"Macedonia");
    }

}
