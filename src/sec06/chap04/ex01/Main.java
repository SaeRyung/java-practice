package sec06.chap04.ex01;
//  💡 와일드카드로 임포트
import sec05.chap08.ex01.*;
//  **익명클래스
//  다른 클래스나 인터페이스로부터 상속받아 만들어짐 - 주로 오버라이드한 메소드 사용
//  한번만 사용되고 버려질 클래스 - 따로 클래스명 부여X, 이후 다시 인스턴스 생성할 필요 없기 때문
//  이후 배울 람다식 나오기 전 사용됌
public class Main {
    public static void main(String[] args) {
        YalcoGroup store1 = new YalcoChicken("울산");
        YalcoGroup store2 = new YalcoCafe("창원", true);

        YalcoGroup store3 = new YalcoGroup(1, "포항"){
            @Override
            public void takeOrder() {
                System.out.printf("유일한 얄코과메기 %s 과메기를 주문해주세요.%n", super.intro());
            }

            public void dryFish(){
                System.out.println("과메기 말리기");
            }
        };

        System.out.println("\n- - - - - - - - - - \n");

        for(YalcoGroup store: new YalcoGroup[]{store1, store2, store3}){
            store.takeOrder();
        }
    }
}
//  💡 익명클래스의 인스턴스는 상속받거나 오버라이드 된 메소드만 호출 가능
