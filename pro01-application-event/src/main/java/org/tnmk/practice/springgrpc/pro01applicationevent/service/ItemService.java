package org.tnmk.practice.springgrpc.pro01applicationevent.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service
public class ItemService {
    public Item getItem(String id) {
        if (!StringUtils.isEmpty(id) && id.matches("[0-9]*")) {
            Item item = new Item();
            item.setId(id);
            item.setName("Some name " + new Date());
            return item;
        } else {
            throw new IllegalArgumentException("The id must not be empty and must be a number.");
        }
    }
}
