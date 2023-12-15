package com.mypersonal;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MypersonalApplicationTests {

    public static final Logger logger = LoggerFactory.getLogger(MypersonalApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("its a test class");
        assertEquals(true, true);
    }



}
