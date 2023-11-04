package com.spring.core.chap02.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  "com.spring.core.chap02")
//@Component가 붙은 클래스 들을 스캔 해서 빈으로 자동 으로 등록 시킨다.   mn

public class HotelManager {

}
