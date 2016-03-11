package com.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class ArgsReader {
    private final String[] args;

    public ArgsReader(String[] args) {
        this.args = args;
    }

    public String getNamingStyle() {
        HashMap<String ,String> abbr = new HashMap<>(2);
        abbr.put("-f","firstNameFirst");
        abbr.put("-l","lastNameFirst");
        return abbr.get(args[0]);
    }


    public String getFileName() {
        for (String arg :args)
            if(!arg.startsWith("-"))
               return arg;
        return null;
    }
    public ArrayList<Filter> getFilters() {
        ArrayList<Filter> filters = new ArrayList<>();
        String[] subArgs = Arrays.copyOfRange(args ,1,args.length);
        HashMap<String ,Filter> allFilters = new HashMap<>();
        allFilters.put("-c",new CountryFilter());
        allFilters.put("-a",new AgeFilter());
        for (String arg: subArgs) {
            String [] option = arg.split("=");
            if(allFilters.containsKey(option[0])){
                Filter f = allFilters.get(option[0]);
                f.addConstraint(option[1]);
                filters.add(f);
            }
        }
        return filters;
    }
}
