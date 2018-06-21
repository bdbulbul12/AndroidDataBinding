package com.programmerhuntbd.bulbul.databinding;

/**
 * Created by bulbul on 6/21/2018.
 */

public class Player {
   private String firstName;
   private String lastName;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Player(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
