package com.example.kyle.mygame;

/**
 * Created by Kyle on 12/17/2016.
 */

public class Main {
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
    private void DoSomething (String someValue) {
        setMyProperty(someValue);
    }
}
