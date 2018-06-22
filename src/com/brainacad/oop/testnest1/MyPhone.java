package com.brainacad.oop.testnest1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    private MyPhoneBook phoneBook;

    public MyPhone() {
        phoneBook = new MyPhoneBook();
    }
    public void swichOn(){
        System.out.print("Loading PhoneBook records…");
        phoneBook.phoneNumbers = new MyPhoneBook.PhoneNumber[10];
        phoneBook.addPhoneNumber("Vasya","+380671234567");
        phoneBook.addPhoneNumber("Ivan","+380732345678");
        phoneBook.addPhoneNumber("Aleksey","+380973456789");
        phoneBook.addPhoneNumber("Aleksandr","+380984567890");
        phoneBook.addPhoneNumber("Svetlana","+380935678901");
        phoneBook.addPhoneNumber("Olya","+380676789012");
        phoneBook.addPhoneNumber("Kiril","+380737890123");
        phoneBook.addPhoneNumber("Petr","+380978901234");
        phoneBook.addPhoneNumber("Oleg","+380989012345");
        phoneBook.addPhoneNumber("Evgeniy","+380930123456");
        System.out.println("OK!");
    }

    public void call(int index){
        System.out.print("Calling to: "+phoneBook.phoneNumbers[index]);
    }

    public class Camera{}
    public class Bluetooth{}
    public class PowerOnButton{}
    public class PhoneBattery{}
    public class PhoneDisplay{}
    public class PhoneSpeaker{}

    public class MyPhoneBook {
        private PhoneNumber[] phoneNumbers;
        private int index;

        public void addPhoneNumber(String name,String phone){
            phoneNumbers[index] = new MyPhoneBook.PhoneNumber(name,phone);
            index++;
        }
        public void printPhoneBook(){
            for (MyPhoneBook.PhoneNumber phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
        }
        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator<MyPhoneBook.PhoneNumber>() {
                @Override
                public int compare(MyPhoneBook.PhoneNumber o1, MyPhoneBook.PhoneNumber o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<MyPhoneBook.PhoneNumber>() {
                @Override
                public int compare(MyPhoneBook.PhoneNumber o1, MyPhoneBook.PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
        }

        public class PhoneNumber{
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
}
