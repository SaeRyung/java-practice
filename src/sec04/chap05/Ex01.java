package sec04.chap05;

public class Ex01 {
    // *메소드
    //  타 언어의 함수 function과 같은 개념
    //  자바는 모든 것이 클래스의 요소이므로 메소드 method 라 부름
    //  실행하는 것은 전부 메인메소드 안에서 실행됌
    public static void main(String[] args) {

        double xx = 3, yy = 4;
        addSubMultDiv(xx, yy);

        xx = 10; yy = 2;
        addSubMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubMultDiv(xx, yy);
    }
    //  메소드 의미
    //  1. 반복을 최소화
    //  ⭐️ 메인 메소드 외부에 선언할 것

    //  void 아무것도 반환하지 않는 메소드
    static void addSubMultDiv (double a, double b){
        System.out.printf("%f + %f = %f%n", a, b , a+b);
        System.out.printf("%f - %f = %f%n", a, b , a-b);
        System.out.printf("%f * %f = %f%n", a, b , a*b);
        System.out.printf("%f / %f = %f%n", a, b , a/b);
    }
}
