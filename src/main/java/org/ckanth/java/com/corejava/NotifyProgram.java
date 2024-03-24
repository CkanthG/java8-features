package org.ckanth.java.com.corejava;


import org.ckanth.java.com.models.Message;

public class NotifyProgram implements Runnable{
    Message message;

    NotifyProgram(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");

        try {
            Thread.sleep(2000);
            synchronized (message) {
                message.setMsg(name+" Notifier work done");
                message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
