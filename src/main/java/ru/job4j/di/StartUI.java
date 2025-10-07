package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;

    @Autowired
    private ConsoleInput input;

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    /**
    Метод для проверки работы ConsoleInput
     */
    public void addFromConsole() {
        String name = input.askStr("Enter name: ");
        store.add(name);
    }
}