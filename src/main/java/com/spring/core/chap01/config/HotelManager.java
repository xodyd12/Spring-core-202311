package com.spring.core.chap01.config;

import com.spring.core.chap01.*;

import java.util.ResourceBundle;

//호텔을 운영하기 위해서 필요한 의존객체를
//전담해서 생성해주는 역할
public class HotelManager {

    //쉐프를 구하는 기능
    public Chef chef() {
        return new jannChef();
    }

    //레스토랑을 계약하는 기능
    public Restaurant restaurant(){
        return  new WesternRestaurant(chef());
    }

    //호텔 생성하는 기능
    public Hotel hotel(){
        return new Hotel(restaurant(), chef());
    }

}
