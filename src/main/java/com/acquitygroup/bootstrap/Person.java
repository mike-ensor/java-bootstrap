package com.acquitygroup.bootstrap;

/**
 * Sample class that does nothing other than contain two fields
 *
 * Meant as an example of creating classes in the main code and using for quick testing in the test package
 */
public class Person {

    private final String first;
    private final String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}
