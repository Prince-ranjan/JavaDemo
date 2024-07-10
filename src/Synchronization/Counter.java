package Synchronization;

public class Counter {
    int value = 0;

    public Counter() {
    }

    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
