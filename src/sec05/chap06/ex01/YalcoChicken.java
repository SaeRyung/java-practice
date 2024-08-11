package sec05.chap06.ex01;
//  *상속
public class YalcoChicken {
    //  protected 자손클래스 사용 가능
    protected int no;
    protected String name;

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder(){
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}

//  Q. 드라이브스루를 갖춘 얄코치킨의 클래스를 만든다면?
//  - 기존 얄코치킨 클래스의 모든 필드와 메소드 포함
//  - 드라이브스루 관련 필드와 메소드 추가
//  ⭐ YalcoChicken 을 부모로 하는 자식 클래스 YalcoChickenDT 만들기
//  extends 연산자 사용
