package com.invitation;

import com.helper.ReadGuestList;

import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) {
        String option = args[0];
        String fileName = args[1];
        ReadGuestList rgl = new ReadGuestList(fileName);
        Library lib = new Library(rgl.read());
        ArrayList<String> labelList = lib.getLabels(option);
        printLabels(labelList);
    }

    private static void printLabels(ArrayList<String> labelList) {
        for (String label : labelList) {
            System.out.printf(label + "\n");
        }
    }
}
