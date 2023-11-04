package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// junit5 : 단위테스트 프레임 워크 - public 붙히면 안됨
//junit4 : 같은건데 이전버전
class PersonTest {

    @Test
    void lombokTest(){
        Person person = new Person();
        person.setName("한태용");
        person.setAge(30);

        String name = person.getName();


    }

}