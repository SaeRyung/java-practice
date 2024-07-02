package sec06.chap06.ex01;
//  **열거형
//  지정된 선택지 내의 몇가지 값을 받을 변수 사용 시
public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);

        //  ⚠️ 아래와 같은 오용이 방지됌
//        button1.setButtonMode(ButtonSpace.DOUBLE);
    }
}
