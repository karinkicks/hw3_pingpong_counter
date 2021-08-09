package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static int count=0;

    Lock l = new ReentrantLock();

    public void inc() {
        l.lock();
        try {
            int c = ++count;
            System.out.println("увеличили счетчик:" + c);
        } finally {
            l.unlock();
        }
    }

    public int getCount(){
        l.lock();
        try {
            return count;
        } finally {
            l.unlock();
        }
    }

}
