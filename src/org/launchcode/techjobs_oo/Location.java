package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location {
    private int id;
    private static int nextId = 1;
    private String value;

    public Location() { //1st constructor which initializes the id field
        id = nextId;
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String value) { //2nd constructor assigns value to the
        this(); //value field, it also initializes id for the object by calling
        this.value = value; //the first constructor with the this() stmt. including
    } //this() in any employer constructor makes initialing id a default behavior

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
