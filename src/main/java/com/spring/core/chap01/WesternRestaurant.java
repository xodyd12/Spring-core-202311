package com.spring.core.chap01;

import lombok.NoArgsConstructor;

public class WesternRestaurant implements Restaurant {
   //의존 객체
    private Chef chef;
    private FrenchCourse course = new FrenchCourse();

//    @NoArgsConstructor // 기본생성자
    public WesternRestaurant(Chef chef){
        this.chef = chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    //요리를 주문하는 기능
    public void order() {
        System.out.println("서양 요리를 주문 합니다.");
        //요리 코스메뉴를 구성해야 함.
        course.combineMenu();
        //요리사에게 요리 명령을 내려야함.
        chef.cook();
    }
}
