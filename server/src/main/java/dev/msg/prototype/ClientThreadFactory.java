package dev.msg.prototype;

import java.util.concurrent.ThreadFactory;

public class ClientThreadFactory implements ThreadFactory {
    private int counter = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("Client-" + counter++);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setDaemon(true);
        return t;
    }
}
