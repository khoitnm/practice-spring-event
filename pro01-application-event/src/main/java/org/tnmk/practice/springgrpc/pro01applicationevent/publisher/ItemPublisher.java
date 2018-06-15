package org.tnmk.practice.springgrpc.pro01applicationevent.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.tnmk.practice.springgrpc.pro01applicationevent.event.Item;

@Component
public class ItemPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishItem(Item item) {
        System.out.println("Publishing custom event. ");
        applicationEventPublisher.publishEvent(item);
    }

}
