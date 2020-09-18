package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField{
    //removed now that class extends JobField:
    // private int id;
    //private static int nextId = 1; //declares variable nextId, since it's static it's changing value is NOT stored within any Employer object
    //private String value;

    //removed now that class extends JobField:
//    public Employer() { //1st constructor lines accept no arguments and
//        id = nextId; //assigns the value of nextId to the id field, it then
//        nextId++; //increments the nextId thus every new Employer object will
//    }  //get a different ID number

    //removed now that class extends JobField:
//    public Employer(String value) { //2nd constructor assigns value to the
//        this(); //value field, it also initializes id for the object by calling
//        this.value = value; //the first constructor with the this() stmt. including
//    } //this() in any employer constructor makes initialing id a default behavior
    public Employer(String value) { //replaced two original contructors with this
        super(value);
    }
}
    // Custom toString, equals, and hashCode methods:

    //removed now that class extends JobField:
//    @Override
//    public String toString() {
//        return value;
//    }

    //removed now that class extends JobField:
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

    //removed now that class extends JobField:
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:

    //removed now that class extends JobField:
//    public int getId() {
//        return id;
//    }

//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//}
