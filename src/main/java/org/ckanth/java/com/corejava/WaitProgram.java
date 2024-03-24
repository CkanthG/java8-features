package org.ckanth.java.com.corejava;


import org.ckanth.java.com.models.Message;

public class WaitProgram implements Runnable{

    private Message message;

    WaitProgram(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (message) {
            try {
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+message.getMsg());
        }
    }
}
