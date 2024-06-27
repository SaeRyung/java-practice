package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        //  💡 클래스 필드와 메소드는 인스턴스를 생성하지 않고 사용
        String ycBrand = YalcoChicken.brand;
        String ycContact = YalcoChicken.contact();

        // ⚠️ 인스턴스 메소드는 불가
        //  String ycName = YalcoChicken.name;
        //  String ycIntro = YalcoChicken.intro();

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String st1Intro = store1.intro();

        //  인스턴스에서는 클래스의 필드와 메소드 사용 가능
        //  ⚠️ 편의상 기능일 뿐, 권장하지 않음 (혼란 초래. IDE에서 자동완성 안 됨 주목)
        String st1Brand = store1.brand;
        String st1Contact = store1.contact();


        //  클래스(정적 statci)요소: 메모리 중 한 곳만 차지
        //  인스턴스 요소들: 각각이 메모리에 자리를 차지
        //      각각 자신만의 프로퍼티 값을 가지고 있음
    }
}
