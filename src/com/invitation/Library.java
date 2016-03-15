package com.invitation;

import com.helper.Filter;

import java.util.ArrayList;

public class Library {
    private final String[] list;

    public Library(String[] list) {
        this.list = list;
    }

    private Person createPerson(String detail) {
            String[] personDetail = detail.split(",");
            Name name = new Name(personDetail[0] ,personDetail[1]);
            Gender gender = new Gender(personDetail[2]);
            Age age = new Age(Integer.parseInt(personDetail[3]));
            Address address = new Address(personDetail[4],personDetail[5],personDetail[6]);
            return new Person(name ,gender ,age ,address);
    }

    private ArrayList<String> getLabels(String option) {
        ArrayList<String> labels = new ArrayList<>(list.length);
        for (String detail : list) {
            Person p = createPerson(detail);
            labels.add(p.getName(option));
        }
        return labels;
    }


    public ArrayList<String> getLabels(String namingStyle, ArrayList<Filter> filters) {
        ArrayList<String> labels = new ArrayList<>(list.length);
        if (filters == null || filters.isEmpty()) return getLabels(namingStyle);
        for (String detail : list) {
            String label = "";
            Person p = createPerson(detail);
            boolean flag = true;
            for (Filter filter : filters) {
                if (filter.check(p) && flag) {
                    label += ", " + filter.getConstraint(p);
                    flag = true;
                }
                else
                    flag = false;
            }
            if(flag) labels.add(p.getName(namingStyle) + label);
        }
        return labels;
    }
}
