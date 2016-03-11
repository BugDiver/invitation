package com.invitation;

import com.helper.Filter;

import java.util.ArrayList;

public class Library {
    private final String[] list;

    public Library(String[] list) {
        this.list = list;
    }

    public ArrayList<String> getLabels(String option) {
        ArrayList<String> labels = new ArrayList<>(list.length);
        for (String detail : list) {
            Person p = new Person(detail.split(","));
            labels.add(p.getName(option));
        }
        return labels;
    }

    public ArrayList<String> getLabels(String namingStyle, ArrayList<Filter> filters) {
        ArrayList<String> labels = new ArrayList<>(list.length);
        if (filters.isEmpty()) return getLabels(namingStyle);
        for (String detail : list) {
            String label = "";
            Person p = new Person(detail.split(","));
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
