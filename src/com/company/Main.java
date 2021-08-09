package com.company;

public class Main {

    public static void main(String[] args) {
//        var pp = new PingPongService();
//
//        new Thread(() -> {
//            pp.ping();
//        }).start();
//        new Thread(() -> {
//            pp.pong();
//        }).start();

        var counter = new Counter();
        while(true){
            new Thread(()->counter.inc()).start();
            new Thread(()-> System.out.println(counter.getCount())).start();
        }
    }
}
