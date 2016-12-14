package com.liuhanlong.tripo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * User: liuhanlong
 * Email: liuhanlong3304@126.com
 * Time: 16/12/8 下午10:57
 */
@SpringBootApplication
@ImportResource("classpath:app-service-consumer.xml")
public class RestBootstrap {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(RestBootstrap.class, args);
    }

}
