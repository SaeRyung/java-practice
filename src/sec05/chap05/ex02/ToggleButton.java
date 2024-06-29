package sec05.chap05.ex02;

public class ToggleButton extends Button{
    private boolean on;

    public ToggleButton(String print, boolean on){
        super(print); //  부모가 먼저 언급되어야 this.on 자식 생성 가능, 생성자는 출생 문제이기 때문에
        this.on = on;
    }

    @Override
    public void func() {
        super.func();  // 💡 부모에서 정의한 메소드 호출, 부모 먼저 호출
        //  그 후 자신의 기능 추가
        this.on = !this.on;
        System.out.println("대문자 입력:" + (this.on ? "ON" : "OFF"));
    }
}
