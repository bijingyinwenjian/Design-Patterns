package com.sky.composite;

public abstract class MenuComponent {
    public String name;
    public int level;

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
