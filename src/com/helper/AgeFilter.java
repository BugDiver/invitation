package com.helper;

import com.invitation.Person;

public class AgeFilter implements Filter {
    private String age;

    @Override
    public boolean check(Person person) {
        return person.isAgeOf(Integer.parseInt(age));
    }

    @Override
    public void addConstraint(String age) {
        this.age = age;
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

        return age != null ? age.equals(ageFilter.age) : ageFilter.age == null;

    }

    @Override
    public int hashCode() {
        return age != null ? age.hashCode() : 0;
    }
}
