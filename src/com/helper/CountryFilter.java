package com.helper;

import com.invitation.Person;

public class CountryFilter implements Filter {
    private String constraint;

    public CountryFilter() {
    }

    @Override
    public boolean check(Person person) {
        return person.isNationality(constraint);
    }

    @Override
    public void addConstraint(String constraint) {
        this.constraint = constraint;
    }

    @Override
    public String getConstraint(Person p) {
        return ""+constraint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryFilter countryFilter = (CountryFilter) o;

        return constraint != null ? constraint.equals(countryFilter.constraint) : countryFilter.constraint == null;

    }

    @Override
    public int hashCode() {
        return constraint != null ? constraint.hashCode() : 0;
    }
}
