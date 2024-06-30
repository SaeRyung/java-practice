package sec05.chap08.ex01;
//  계열사들간의 공통 특성
//  얄코그룹으로 묶어줌
public abstract class YalcoGroup {
    protected static final String CREED = "우리의 %s 얄팍하다";

    //  💡 클래스 메소드는 abstract 불가
    //  인스턴스로 쓰는 것이 아니므로
    //  abstract static String getCreed ();

    //  abstract class field와 method 가질 수 있음
    //  자식들이 물려받기 때문에 protected로 구현
    protected final int no;
    protected final String name;

    // method YalcoGroup, intro 일반클래스처럼 작성 가능
    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public String intro(){
        return "%d호 %s점 입니다.".formatted(no, name);
    }
    //  이후 다른 패키지에서의 실습을 위해 public으로
    public abstract void takeOrder();
    //  abstract, 구현부 작성X
    //  추상메서드
    //  스스로 선언만 하고 구현 안함 > 자식class 구현하여 사용

}
