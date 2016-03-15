package com.invitation;

public class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public boolean isOlderThan(int age) {
        return this.age >= age;
    }

    @Override
    public String toString() {
        return String.format( "%d",age);
    }
}
