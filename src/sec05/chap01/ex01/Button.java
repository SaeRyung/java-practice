package sec05.chap01.ex01;
//  * 1. 클래스 기초
//  클래스 class: 각 버튼이 갖고 있을 속성(들)과 기능(들)을 정의
public class Button {
    char print;
    int space;
    String mode;

    Button(char print, int space, String mode){
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    // 단순 출력, 포멧 출력 메소드
    void place(){
        System.out.printf("표시: %c, 공간: %s, 모드: %s%n", print, space, mode);
    }
}
