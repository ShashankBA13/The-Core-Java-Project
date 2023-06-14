package org.java.collections.list;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class CopyOnWriteArrayListMultithreadExample {
    public static void main(String[] args) {
        final CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        final ReentrantLock lock = new ReentrantLock();

        // Create and start multiple threads
        Thread writerThread = new Thread(new WriterThread(list));
        Thread readerThread = new Thread(new ReaderThread(list, lock));

        writerThread.start();
        readerThread.start();
    }
}

class WriterThread implements Runnable {
    private final CopyOnWriteArrayList<Integer> list;

    public WriterThread(CopyOnWriteArrayList<Integer> list) {
        this.list = list;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            System.out.println("Added: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReaderThread implements Runnable {
    private final ReentrantLock lock;
    private CopyOnWriteArrayList<Integer> list;

    public ReaderThread(CopyOnWriteArrayList<Integer> list, ReentrantLock lock) {
        this.list = list;
        this.lock = lock;
    }

    public void run() {
        lock.lock();
        try {
            for (Integer element : list) {
                System.out.println("Read: " + element);
                Thread.sleep(500); // Introduce a delay to demonstrate concurrent access
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    // TODO: 25-05-2023  Need to work more on this
}
