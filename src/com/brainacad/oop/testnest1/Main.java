package com.brainacad.oop.testnest1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Vasya","+380671234567");
        myPhoneBook.addPhoneNumber("Ivan","+380732345678");
        myPhoneBook.addPhoneNumber("Aleksey","+380973456789");
        myPhoneBook.addPhoneNumber("Aleksandr","+380984567890");
        myPhoneBook.addPhoneNumber("Svetlana","+380935678901");

        myPhoneBook.printPhoneBook();

        System.out.println("--------------------LabWork_2.12.2------------------------");
        MyPhoneBook phoneBook = new MyPhoneBook();
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

        phoneBook.sortByName();
        phoneBook.printPhoneBook();
    }
}
