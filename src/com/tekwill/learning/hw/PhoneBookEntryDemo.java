package com.tekwill.learning.hw;

import java.util.ArrayList;

public class PhoneBookEntryDemo {
    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> phonebook = new ArrayList<PhoneBookEntry>();

        PhoneBookEntry jhon1 = new PhoneBookEntry("Jhon1", "185486486");
        PhoneBookEntry jhon2 = new PhoneBookEntry("Jhon2", "456486446");
        PhoneBookEntry jhon3 = new PhoneBookEntry("Jhon3", "654864662");
        PhoneBookEntry jhon4 = new PhoneBookEntry("Jhon4", "456489466");
        PhoneBookEntry jhon5 = new PhoneBookEntry("Jhon5", "846486456");

        phonebook.add(jhon1);
        phonebook.add(jhon2);
        phonebook.add(jhon3);
        phonebook.add(jhon4);
        phonebook.add(jhon5);

        for (int index = 0; index < phonebook.size(); index++) {
            System.out.println(phonebook.get(index).toString());
        }
    }
}
