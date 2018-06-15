package org.tnmk.practice.springgrpc.pro01applicationevent.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.tnmk.practice.springgrpc.pro01applicationevent.event.ItemEvent;

@Component
public class ItemListener {

    @Async
    @EventListener
    public void listenEvent(ItemEvent item) {
        System.out.println("Received spring custom event - " + item);
    }
}
