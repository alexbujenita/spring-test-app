package com.buje.app.ws.mobileappws.ui.model.response;

import java.util.List;

public class UserRest {
    private String userId;
    private String firstName;
    private String lastname;
    private String email;
    private List<AddressesRest> addresses;

    public List<AddressesRest> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesRest> addresses) {
        this.addresses = addresses;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
