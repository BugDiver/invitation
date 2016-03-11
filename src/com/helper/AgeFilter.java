package com.helper;

import com.invitation.Person;

public class AgeFilter implements Filter {
    private int age;

    @Override
    public boolean check(Person person) {
        return person.isAbove(age);
    }

    @Override
    public void addConstraint(String age) {
        this.age = Integer.parseInt(age);
    }

    @Override
    public String getConstraint(Person p) {
        return p.getPersonAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgeFilter ageFilter = (AgeFilter) o;

        return age == ageFilter.age;

    }

    @Override
    public int hashCode() {
        return age;
    }
}
