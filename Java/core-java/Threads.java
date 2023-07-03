package com.core.java;

//class StartThread extends Thread{
//    public void run() {
//        for (int i=0;i<10;i++){
//            System.out.println(i);
//
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}

class StartThread implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
//        StartThread thread1=new StartThread();
//        thread1.start();
//        StartThread thread2=new StartThread();
//        thread2.start();
        Thread thread1 = new Thread(new StartThread());
        Thread thread2 = new Thread(new StartThread());
        thread1.start();
        thread2.start();
    }
}
