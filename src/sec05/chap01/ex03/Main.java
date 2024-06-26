package sec05.chap01.ex03;

public class Main {
    public static void main(String[] args) {
        //  클래스로 인스턴스 생성 - 💡 new 연산자 + 생성자 호출
        //  본사의 방침대로 매장을 내는것
        //  생성자 YalcoChicken 를 new 붙여서 호출
        YalcoChicken store1 = new YalcoChicken(3, "판교");
        YalcoChicken store2 = new YalcoChicken(17, "강남");
        YalcoChicken store3 = new YalcoChicken(24, "제주");

        String[] intros = {store1.intro(), store2.intro(), store3.intro()};

        System.out.println(intros);
    }
}

//  메서드 이름 없이, 반환 타입(해당클래스)뒤로 괄호가 따라옴
//  'return'을 명시하지 않음 - 해당 클래스 타입의 인스턴스 반환
//  'new'연산자와 함께 사용되어 인스턴스 반환
//  필수 작성 아님 - 언제나 같은 내용의 인스턴스 반환할 경우
//      작성되지 않았을 경우 인자 없이 호출
//      ⭐ 코드에 작성하지 않아도 컴파일러 자동 생성
//      '.class' 파일에서 확인 가능
