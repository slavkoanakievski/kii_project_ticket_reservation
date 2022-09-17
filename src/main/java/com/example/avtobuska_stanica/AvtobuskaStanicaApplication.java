package com.example.avtobuska_stanica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AvtobuskaStanicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvtobuskaStanicaApplication.class, args);
    }

}
