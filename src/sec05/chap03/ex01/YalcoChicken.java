package sec05.chap03.ex01;

public class YalcoChicken {
    //  ⭐️ 클래스/정적 필드와 메소드들 : 본사의 정보와 기능
    //  인스턴스마다 따로 갖고 있을 필요가 없는 것들에 사용
    static String brand = "얄코치킨"; //  static 본사 필드,매장마다 달라지지 X

    //  본사 기능
    static String contact(){
        //  ⚠️ 정적 메소드에서는 인스턴스 프로퍼티 사용 불가
        //  System.out.println(name);
        return "%s 입니다. 무엇을 도와드릴까요?".formatted(brand);
    }


    //  매장의 정보 기능, 인스턴트 만들어 접근함

    int no;
    String name;

    YalcoChicken(int no, String name){
        this.no = no;
        this.name = name;
    }

    String intro(){
        //  💡 인스턴스 메소드에서는 정적 프로퍼티 사용 가능
        //  매장에서는 본사의 정보 사용 가능
        return "안녕하세요, %s %d호 %s점 입니다.".formatted(brand, no, name);
    }
}

//  클래스(정적 statci)요소: 메모리 중 한 곳만 차지
//  인스턴스 요소들: 각각이 메모리에 자리를 차지
//      각각 자신만의 프로퍼티 값을 가지고 있음
