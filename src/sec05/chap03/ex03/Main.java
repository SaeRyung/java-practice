package sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);
        Button buttonPlus = new Button('+', 3);
        Button buttonClear = new Button('C', 2);

        Button[] buttons = {button1, buttonPlus, buttonClear};

        System.out.println(Button.mode);
        // Button 클래스 참조,  : button: 하나하나, buttons: 배열 변수
        for (Button button_i : buttons) { button_i.place(); }

        //  연속으로 붙여넣어 실행해볼 것
        //  Button class의 switchMode 메서드 실행해서 mode 변경
        Button.switchMode(); //  LIGHT -> DARK
        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        Button.switchMode();
        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }
    }
}
