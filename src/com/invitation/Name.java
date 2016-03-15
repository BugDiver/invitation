package com.invitation;

import java.util.HashMap;

public class Name {
    private HashMap<String, String> formattedNames = new HashMap<>(2);

    public Name(String fName , String lName) {
        this.formattedNames.put("firstNameFirst", fName +" "+ lName);
        this.formattedNames.put("lastNameFirst", lName +", "+ fName);
    }

    public String getFormattedName(String option) {
        return formattedNames.get(option);
    }

}
