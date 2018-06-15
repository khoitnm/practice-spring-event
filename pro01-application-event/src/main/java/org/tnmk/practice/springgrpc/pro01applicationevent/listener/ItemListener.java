package org.tnmk.practice.springgrpc.pro01applicationevent.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.tnmk.practice.springgrpc.pro01applicationevent.event.Item;

@Component
public class ItemListener {

    @Async
    @EventListener
    public void listenEvent(Item item) {
        System.out.println("Received spring custom event - " + item);
    }
}
