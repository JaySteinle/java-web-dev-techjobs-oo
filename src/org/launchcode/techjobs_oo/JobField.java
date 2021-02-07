package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    private JobField jobField;

//Constructors(2)
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        if (value.equals("")) {
            this.value = "Data not available";
        } else {
            this.value = value;
        }
    }
//Overrides(3)
    @Override
    public String toString(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField1 = (JobField) o;
        return jobField.equals(jobField1.jobField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobField);
    }

    //Getters(2) & Setters(1)
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