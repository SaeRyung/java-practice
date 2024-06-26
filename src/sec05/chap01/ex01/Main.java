package sec05.chap01.ex01;
//  객체 object / 인스턴스 instance: 속성(프로퍼티)들과 기능(메소드)들의 묶음
//  자바에서는 객체와 인스턴스를 같은 것으로 이해해도 됌
//  인스턴스는 클래스에서 정의한 방식으로 양산됨
public class Main {
    //  클래스 선언 > 다른 인스턴스의 자료형이 된다.
    public static void main(String[] args) {
        Button button1 = new Button('1', 1, "Dark");
        Button buttonPlus = new Button('+', 3, "Dark");
        Button buttonClear = new Button('C', 2, "Dark");

        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
