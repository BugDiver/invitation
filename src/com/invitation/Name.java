package com.invitation;

import java.util.HashMap;

public class Name {
    private final String firstName;
    private final String lastName;
    private HashMap<String, String> formatedNames = new HashMap<>(2);

    public Name(String fName , String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.formatedNames.put("-f",firstName+" "+lastName);
        this.formatedNames.put("-l",lastName+","+firstName);

    }

    public String getFormattedName(String option) {
        return formatedNames.get(option);
    }
}
