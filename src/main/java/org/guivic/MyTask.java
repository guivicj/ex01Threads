package org.guivic;

public class MyTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Counter - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
