package com.company;

public class Passenger {
    private static int idCnt;
    private int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        String name, emailAddress;
        int phoneNumber;

        public Contact(String name, int phoneNumber, String emailAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

    }
    private Contact contact;

    static {
        idCnt = 0;
    }

    public Passenger(String contactName, int contactPhoneNumber, String contactEmailAddress, String addressStreet,
                     String addressCity, String addressState) {
        this.id = ++idCnt;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhoneNumber, contactEmailAddress);
    }

    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phoneNumber + ", " + contact.emailAddress;
    }

    public String getName() {
        return contact.name;
    }

}
