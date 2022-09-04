package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID id;              //UUID is a class that create a random UUID which is unique
                                  //Customer Class needs a field from a Class already built in Java not from a class we created
                                  // It's coming from a different class so it has to be imprted
    private String userName;
    private String email;
    private List<Address> address;

    public Customer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }
}
