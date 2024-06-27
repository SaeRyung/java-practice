package sec05.chap02.ex03;

import java.util.Arrays;

//  클래스의 필드로 다른 클래스의 인스턴스를 담은 배열을 가짐
//      클래스가 인스턴스가 배열 등 다른 자료형에도, 그 반대로도 포함될 수 있음
//  클래스는 둘 이상의 생성자 가질 수 있음
//  인스턴스를 반환하는 메소드
public class YalcoChicken {
    int no;
    String name;
    //  클래스의 필드로 배열 가능
    ChickenMenu[] menus; // 다른 클래스의 인스턴스 담은 배열

    YalcoChicken(int no, String name, ChickenMenu[] menus){
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu(String name){
        for(ChickenMenu menu: menus){
            if(menu.name.equals(name)){ // 🔴
                return menu;
            }
        }
        return null;
    }
}
