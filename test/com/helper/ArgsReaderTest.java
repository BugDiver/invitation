package com.helper;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArgsReaderTest {
    @Test
    public void testArgsReaderShouldBeAbleToRetrieveTheProvidedNamingConvention() {
        String args = "-f guestList.txt";
        ArgsReader argsReader = new ArgsReader(args.split(" "));
        assertEquals(argsReader.getNamingStyle() ,"firstNameFirst");
    }

    @Test
    public void testArgsReaderShouldBeAbleToRetrieveTheProvidedGuestList() {
        String args = "-f guestList.txt";
        ArgsReader argsReader = new ArgsReader(args.split(" "));
        assertEquals(argsReader.getNamingStyle() ,"firstNameFirst");
        assertEquals(argsReader.getFileName() ,"guestList.txt");

    }

    @Test
    public void testArgsReaderShouldBeAbleToRetriveVariousFiltersAccordingToProvidedOptions() {
        String args = "-f -a=20 -c=Bangladesh guestList.txt";
        ArgsReader argsReader = new ArgsReader(args.split(" "));

        AgeFilter af = new AgeFilter();
        af.addConstraint("20");
        CountryFilter cf = new CountryFilter();
        cf.addConstraint("Bangladesh");

        ArrayList<Filter> filters = new ArrayList<>();
        filters.add(af);
        filters.add(cf);

        assertTrue(filters.equals(argsReader.getFilters()));



    }
}
