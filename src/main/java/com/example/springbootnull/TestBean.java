package com.example.springbootnull;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Slf4j
public class TestBean {

    @Value("${employees}")
    private List<Item> items;

    @PostConstruct
    public void run() {
        for (Item i : items) {
            log.info(i.toString());
        }
    }

}
