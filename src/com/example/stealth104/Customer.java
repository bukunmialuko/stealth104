package com.example.stealth104;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "is required")
    private String firstName;

    @NotBlank
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "must be greater or equal to zero")
    @Max(value = 10, message = "must be less than or equal to ten")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "only 5 chars/digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
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
