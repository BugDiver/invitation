package com.invitation;



public class Person {
    private final Name name;
    private final Gender gender;
    private final int age;
    private final Address address;

    public Person(String[] detail) {
        this.name = new Name(detail[0] ,detail[1]);
        this.gender = new Gender(detail[2]);
        this.age = Integer.parseInt(detail[3]);
        this.address = new Address(detail[4],detail[5],detail[6]);
    }


    public String getName(String option) {
        return gender.getPrefix()+" "+name.getFormattedName(option);
    }
}
