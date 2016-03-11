package com.invitation;

import com.helper.ArgsReader;
import com.helper.Filter;
import com.helper.ReadGuestList;
import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) {
        ArgsReader argsReader = new ArgsReader(args);

        String namingStyle = argsReader.getNamingStyle();
        String fileName = argsReader.getFileName();
        ArrayList<Filter> filters = argsReader.getFilters();

        ReadGuestList rgl = new ReadGuestList(fileName);
        Library lib = new Library(rgl.read());

        ArrayList<String> labelList = lib.getLabels(namingStyle ,filters);
        printLabels(labelList);
    }

    private static void printLabels(ArrayList<String> labelList) {
        for (String label : labelList) {
            System.out.println(label);
        }
    }
}
