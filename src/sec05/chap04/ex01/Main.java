package sec05.chap04.ex01;
//  *접근제어자 private(접근제한자)
public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; //  ⚠️ 불가
    }
}
//  * 클래스의 특정 요소를 감추는 이유
//  감추는 것이 아님 - 코드로 확인 가능
//      라이브러리 예시 확인

//  작성자의 의도대로 사용하도록 하기 위함

//  필드에 부적절한 값이 적용되는 등의 오용 방지
//  다른 클래스와 복합적으로 사용될 경우 혼선 방지