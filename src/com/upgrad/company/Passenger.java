package com.upgrad.company;

public class Passenger {


        private static int idCounter;
        private int id;

        private static class Address{

            String street, city, state;

            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }

        }

        private Address address;

        private static class Contact{

            String name, phone, email;

            public Contact(String name, String phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }

        }
        private Contact contact;

        static {
            idCounter = 0;
        }

        public Passenger(String addressStreet, String addressCity,
                         String addressState, String contactName, String contactPhone,
                         String contactEmail) {
            this.id = ++idCounter;
            this.address = new Address(addressStreet, addressCity, addressState);
            this.contact = new Contact(contactName, contactPhone, contactEmail);
        }

        public int getId() {
            return this.id;
        }
       public void setId(int id){this.id = id;}

        public String getAddressDetails() { // Address Details
            return "Address Details: "+address.street + ", " + address.city + ", " + address.state;
        }

        public String getContactDetails() { // Contact Details
            return "Contact Details: "+contact.name + ", " + contact.phone + ", " + contact.email;
        }
    }


