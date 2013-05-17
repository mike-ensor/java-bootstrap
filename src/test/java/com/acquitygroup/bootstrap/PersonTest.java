package com.acquitygroup.bootstrap;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonTest {

    @Test
    public void firstTest() {
        Person myClass = new Person("First Name", "Last Name");

        // if this is a brand new concept, just use assert (see below)
        assertThat(myClass.getFirst(), is("First Name"));

        assert myClass.getFirst().equals("First Name");
    }

    @Test
    public void lastTest() {
        Person myClass = new Person("First Name", "Last Name");

        assertThat(myClass.getLast(), is("Last Name"));
    }

    @Test
    public void someNameHere() {
        // construct your class(es)

        // mutate or whatever

        // verify here
    }
}
