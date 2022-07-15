package com.ll.exam;

public class ArrayList {

    private int size;
    private int[] data;

    public ArrayList() {
        size = 0;
        data = new int[100];
    }

    public int size() {
        return size;
    }

    public void add(int datum) {
        data[size] = datum;

        size++;
    }

    public int get(int index) {
        return data[index];
    }
}
