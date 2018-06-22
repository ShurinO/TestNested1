package com.brainacad.oop.testnest1;

import java.util.Arrays;

public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private int index;

    public void addPhoneNumber(String name,String phone){
        phoneNumbers[index] = new PhoneNumber(name,phone);
        index++;
    }
    public void printPhoneBook(){
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public static class PhoneNumber{
        private String name;
        private String phone;

        @Override
        public String toString() {
            return "Name: " + name +
                    ", phone:" + phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public PhoneNumber(String name, String phone) {

            this.name = name;
            this.phone = phone;
        }
    }
}
