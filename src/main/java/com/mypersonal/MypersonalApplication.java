package com.mypersonal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MypersonalApplication implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(MypersonalApplication.class);

    public static void main(String[] args) {
        logger.info("It's a continuous integration job  ");
        SpringApplication.run(MypersonalApplication.class, args);
    }

	//Line added
	//comment for testing build every min..
    @Override
    public void run (String... args){
        logger.info("It's my second logger");
    }
}
