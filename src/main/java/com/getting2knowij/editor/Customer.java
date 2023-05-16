package com.getting2knowij.editor;

class Customer {
    public long getId() {
        return id;
    }

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    long id;
    String name;
}
