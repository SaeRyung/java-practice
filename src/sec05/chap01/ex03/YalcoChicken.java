package sec05.chap01.ex03;
//  *생성자 메소드 - 매장을 내는 메소드
public class YalcoChicken {
    int no;
    String name;

    //  클래스와 같은 이름(반환값), 메소드명 따로 없다: 생성자
    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴. 본사가 생성할 매장 가르침
    //  매장을 내는 메소드_매장을 내려면 이런 형식으로 내라 가이드
    public YalcoChicken(int no, String name){
        //  this.no 와 no 구분
        this.no = no;
        this.name = name;
    }
    //  매장 할 일
    String intro(){
//          String name = "몽고반";
        //  주석해제 시 name 대체
//        YalcoChicken thisshop = this; //  들어간 매장 확인용
        return "안녕하세요, %d호 %s점 입니다.".formatted(no, name); // 🔴
    }
}
