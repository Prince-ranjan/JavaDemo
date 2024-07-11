package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class Counter {
    int value = 0;

    private final Lock lock = new ReentrantLock();

    public Counter() {
    }

    public void increment() {
        lock.lock();
        value++;
        lock.unlock();
    }

    public int getValue() {
        return value;
    }
}
