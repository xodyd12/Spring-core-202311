package com.spring.core.chap02;

import com.spring.core.chap02.config.HotelManager;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    //스프링 컨테이너 읽어오는 객체
     AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HotelManager.class);
    @Test
    void hotelAutoTest(){
        Hotel hotel = ctx.getBean(Hotel.class);
        hotel.reserve();
    }

}