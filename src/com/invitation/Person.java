package com.invitation;

public class Person {
    private final Name name;
    private final Gender gender;
    private final Address address;
    private final Age age;

    public Person(Name name, Gender gender, Age age, Address address) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }


    public String getName(String option) {
        return gender.getPrefix() +" "+ name.getFormattedName(option);
    }

    public boolean isNationality(String country) {
        return address.isCountry(country);
    }

    public boolean isAgeOf(int age) {
        return this.age.isOlderThan(age);
    }

    public String getPersonAge() {
        return age.toString();
    }

}
