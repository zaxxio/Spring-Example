package com.openchain.app.bootloader;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log
@Component
public class Bootloader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Hello World");
    }
}
