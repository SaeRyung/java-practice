package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        //  💡 클래스 필드와 메소드는 인스턴스를 생성하지 않고 사용

        //  본사 자체에서 바로 사용
        String ycBrand = YalcoChicken.brand;
        String ycContact = YalcoChicken.contact();

        // ⚠️ 인스턴스 메소드는 불가
        //  본사에 가서 매장 찾기 불가
//          String ycName = YalcoChicken.name;
//          String ycIntro = YalcoChicken.intro();

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String st1Intro = store1.intro();

        //  인스턴스에서는 클래스의 필드와 메소드 사용 가능
        //  ⚠️ 편의상 기능일 뿐, 권장하지 않음 (혼란 초래. IDE에서 자동완성 안 됨 주목)
        String st1Brand = store1.brand;

//        String st1Contact = store1.contact();
        //  본사의 기능을 매점에서 꺼내 씀 > 권장X / 인스턴스의 메소드인 것처럼 착각할 수 있다.
        String st1Contact = YalcoChicken.contact();



    }
}
