package com.company;

public class PingPongService {

    private String p="pong";

    public synchronized void ping(){
        while (p!="pong"){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        p="ping";
        System.out.println(p);
        notifyAll();
        ping();
    }

    public synchronized void pong(){
        while (p!="ping"){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        p="pong";
        System.out.println(p);
        notifyAll();
        pong();
    }
}
