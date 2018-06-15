package org.tnmk.practice.springgrpc.pro01applicationevent.event;

public interface ItemEvent {
    String getId();

    void setId(String id);

    String getName();

    void setName(String name);
}
