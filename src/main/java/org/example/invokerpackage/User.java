package org.example.invokerpackage;

import org.example.interfacecomand.Command;

public class User {
    Command search;
    Command add;
    Command delete;

    public User(Command search, Command add, Command delete) {
        this.search = search;
        this.add = add;
        this.delete = delete;
    }
    void searchDevice(){
        search.execute();
    }
    void addDevice(){
        add.execute();
    }
    void deleteDevice(){
        delete.execute();
    }
}
