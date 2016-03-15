package com.invitation;

import com.helper.AgeFilter;
import com.helper.CountryFilter;
import com.helper.Filter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class LibraryTest {
    @Test
    public void testLibraryCanGiveTheFormattedLabelAccordingToOption(){
        String [] gustList = {"Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia",
                              "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh",
                              "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh"};
        Library lib = new Library(gustList);
        ArrayList<String> labels = lib.getLabels("firstNameFirst",null);
        ArrayList<String> expected = new ArrayList<>(4);
        expected.add("Ms. Julius Barrows");
        expected.add("Ms. Melody Dooley");
        expected.add("Mr. Carlos Johns");

        assertTrue(expected.equals(labels));
    }
    @Test
    public void testLibraryCanGiveTheFormattedLabelAccordingToOptionForAnotherOption(){
        String [] gustList = {"Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia",
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh",
                "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh"};
        Library lib = new Library(gustList);
        ArrayList<String> labels = lib.getLabels("lastNameFirst" ,null);
        ArrayList<String> expected = new ArrayList<>(4);
        expected.add("Ms. Barrows, Julius");
        expected.add("Ms. Dooley, Melody");
        expected.add("Mr. Johns, Carlos");
        
        assertTrue(expected.equals(labels));
    }

    @Test
    public void testLibraryCanGiveTheFormattedLabelWithProvidedFilter(){
        String [] gustList = {"Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia",
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh",
                "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh"};
        Library lib = new Library(gustList);
        ArrayList<Filter> filters = new ArrayList<>();
        AgeFilter ageFilter = new AgeFilter();
        ageFilter.addConstraint("20");
        filters.add(ageFilter);

        ArrayList<String> labels = lib.getLabels("firstNameFirst" ,filters);
        ArrayList<String> expected = new ArrayList<>(4);
        expected.add("Ms. Melody Dooley, 31");
        expected.add("Mr. Carlos Johns, 35");

        assertTrue(expected.equals(labels));
    }
    @Test
    public void testLibraryCanGiveTheFormattedLabelWithProvidedMoreThanOneFilters() {
        String[] guestList = {"Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia",
                "Melody,Dooley,Female,31,West Shanna,Vermont,Macedonia",
                "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh"};
        Library lib = new Library(guestList);
        ArrayList<Filter> filters = new ArrayList<>();

        AgeFilter ageFilter = new AgeFilter();
        ageFilter.addConstraint("20");
        filters.add(ageFilter);

        CountryFilter countryFilter = new CountryFilter();
        countryFilter.addConstraint("Bangladesh");
        filters.add(countryFilter);

        ArrayList<String> labels = lib.getLabels("firstNameFirst", filters);
        ArrayList<String> expected = new ArrayList<>(4);
        expected.add("Mr. Carlos Johns, 35, Bangladesh");

        assertTrue(expected.equals(labels));

    }
}
