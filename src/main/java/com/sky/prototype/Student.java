package com.sky.prototype;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
    private String address;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
