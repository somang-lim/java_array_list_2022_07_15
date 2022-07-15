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

    public void addAt(int datum, int index) {
        if(size == 0) {
            add(datum);
        }

        size++;


        if(size < data.length) {
            add(datum);
        }

        sizeUpIfFull();

        for(int i = size; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = datum;

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

        int beforeLength = data.length;
        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
        System.out.printf("배열의 크기가 증가되었습니다. %d => %d\n", beforeLength, data.length);
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
