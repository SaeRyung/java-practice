package sec05.chap03.ex03;

public class Button {

    //  static 메소드이기 때문에 Main에서 공통적으로 적용됌
    static String mode = "LIGHT";

    static void switchMode(){
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }
    char print;
    int space;

    Button(char print, int space){
        this.print = print;
        this.space = space;
    }

    void place(){
        System.out.printf("표시: %c, 공간: %d, 모드: %s%n", print, space, mode);
    }
}
