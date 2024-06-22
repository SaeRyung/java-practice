package sec03.chap01;

public class Ex07 {
    public static void main(String[] args) {
        // 단항연산자
        // 💡 자료형의 범위를 넘어가도록 숫자를 더하거나 뺄 경우
        byte x = 127;
        x += 1;

        byte y = -128;
        y -= 1;
        //논리오류. 그냥 int 사용하면 다 넘어감
    }
}
