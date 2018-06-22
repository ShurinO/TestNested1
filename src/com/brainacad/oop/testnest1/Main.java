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
    }
}
