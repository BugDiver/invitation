package com.invitation;

import java.util.ArrayList;

public class Library {
    private final String[] list;

    public Library(String[] list) {
        this.list = list;
    }

    public ArrayList<String> getLabels(String option) {
        ArrayList<String> labels = new ArrayList<>(list.length);
        for (String detail:list) {
            Person p = new Person(detail.split(","));
            labels.add(p.getName(option));
        }
        return labels;
    }
}
