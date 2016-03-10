package com.invitation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testLibraryCanGiveTheFormattedLabelAccordingToOption(){
        String [] gustList = {"Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia",
                              "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh",
                              "Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh"};
        Library lib = new Library(gustList);
        ArrayList<String> labels = lib.getLabels("-f");
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
        ArrayList<String> labels = lib.getLabels("-l");
        ArrayList<String> expected = new ArrayList<>(4);
        expected.add("Ms. Barrows,Julius");
        expected.add("Ms. Dooley,Melody");
        expected.add("Mr. Johns,Carlos");
        
        assertTrue(expected.equals(labels));
    }
}
