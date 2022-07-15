package com.example.springbootnull;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Slf4j
@Data
@ConfigurationProperties(prefix = "employees")
public class TestBean {

    private List<Item> items;

    @PostConstruct
    public void run() {
        for (Item i : items) {
            log.info(i.toString());
        }
    }

}
