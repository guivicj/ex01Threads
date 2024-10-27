package org.guivic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread t1 = new MyTask();
        Thread t2 = new MyTask();
        Thread t3 = new MyTask();
        Thread t4 = new MyTask();
        Thread t5 = new MyTask();
        Thread t6 = new MyTask();
        Thread t7 = new MyTask();
        Thread t8 = new MyTask();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}