package sec05.chap05.ex02;
//  메소드 오버라이딩
//  부모가 가진 같은 이름의 메소드를 자식이 다르게 정의: 저는 제 방식대로 하겠습니다.
//  오버로딩과 다르다
public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        entrButton.func();

        System.out.println("\n- - - - -\n");

        stdnButton.func();

        System.out.println("\n- - - - -\n");

        tglButton.func();
        tglButton.func();
        tglButton.func();
    }
}
