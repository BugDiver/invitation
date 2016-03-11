package com.helper;

import com.invitation.Person;

public interface Filter {
    boolean check(Person person);
    void addConstraint(String s);
    String getConstraint(Person p);
}
