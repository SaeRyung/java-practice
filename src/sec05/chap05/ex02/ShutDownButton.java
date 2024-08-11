package sec05.chap05.ex02;

public class ShutDownButton extends Button{
    public ShutDownButton(){
        super("shutDown");
        //  💡 부모의 생성자 호출
        // super("shutDown"); = Button class의 Button(String print)와 같다.
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func() {
        System.out.println("프로그램 종료");
    }
}
