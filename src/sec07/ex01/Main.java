package sec07.ex01;
//  **toString 메소드
//  기본적으로 클래스명과 해시값 반환
public class Main {
    public static void main(String[] args) {
        Button button1 = new Button("엔터", Button.Mode.DARK, 3);

        //  💡 메소드를 ctrl/command + 클릭하여 Object 클래스 사양 살펴보기
        System.out.println(button1); // ⭐️ toString() 을 붙인 것과 같음
        //  결과: sec07.ex01.Button@41629346
    }
}
