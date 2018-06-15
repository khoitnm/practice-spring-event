package org.tnmk.practice.springgrpc.pro01applicationevent.event;

public class Item {
    private String id;
    private String name;

    public String toString(){
        return "{id: "+id+", name: "+name+"}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
