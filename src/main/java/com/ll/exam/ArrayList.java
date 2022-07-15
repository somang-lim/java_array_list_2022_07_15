package com.ll.exam;

public class ArrayList {

    private int size;
    private int[] data;

    public ArrayList() {
        size = 0;
        data = new int[2];
    }

    public int size() {
        return size;
    }

    public void add(int datum) {
        sizeUpIfFull();

        data[size] = datum;

        size++;
    }

    public int get(int index) {
        return data[index];
    }

    public void removeAt(int index) {
        for(int i = index; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        size--;
    }

    public int getArrayLength() {
        return data.length;
    }

    private void sizeUpIfFull() {
        if(isFull()) {
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] newData = new int[data.length * 2];

        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for(int i = 0; i < size; i++) {
            System.out.printf("%d : %d\n", i, data[i]);
        }
    }
}
