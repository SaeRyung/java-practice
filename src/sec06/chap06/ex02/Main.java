package sec06.chap06.ex02;
//  **클래스 내부에 작성하여 오용 여지 제거하기
//  버튼에 사용되는 속성들이므로
public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setMode(Button.Mode.DARK);

        button1.setSpace(Button.Space.DOUBLE);
    }
}
