package com.invitation;

import java.util.HashMap;

public class Gender {
    private final String gender;
    private final HashMap<String, String> prefixes = new HashMap<>(2);

    public Gender(String gender) {
        this.gender = gender;
        this.prefixes.put("MALE","Mr.");
        this.prefixes.put("FEMALE","Ms.");
    }

    public String getPrefix() {
        return this.prefixes.get(gender.toUpperCase());
    }
}
