package com.mewo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LayuidemoApplication {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LayuidemoApplication.class, args);
        System.out.println("-------start success！！--------");
        System.out.println("http://localhost:9090/index");
    }
}
