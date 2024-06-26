package sec05.chap01.ex02;

public class Main {
    public static void main(String[] args) {
        //  본사 소속의 매장을 내는 코드
        //  YalcoChicken 를 인스턴스-자료형으로 만들어 사용한다.
        YalcoChicken store1 = new YalcoChicken();
        store1.no = 3;  // 🔴
        store1.name = "판교";

        YalcoChicken store2 = new YalcoChicken();
        store2.no = 17;  // 🔴
        store2.name = "강남";

        //  인스턴스 필드들에 접근해 필요한 정보 추출가능
        int store1No = store1.no;
        String store2Name = store2.name;

        // 매장 기능 사용
        //  인스턴스의 메소드 호출
        //  인스턴스 + . => 사용할 수 있는 메소드
        String store1Intro = store1.intro();
        String store2Intro = store2.intro();

        System.out.println(store1Intro);
        System.out.println(store2Intro);
    }
}

//  디버깅 툴로 인스턴스들 살펴볼 것
//  'out' 디렉토리 살펴볼 것 - 클래스들이 '.class' 파일로 생성
