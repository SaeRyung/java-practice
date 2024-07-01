package sec06.chap02.pkg4;

//import sec06.chap02.pkg1.Child;
import sec06.chap02.pkg1.Parent;
//  ⭐️ 와일드카드 라고 불림
//  해당 패키지 내 모든 클래스 가져올 수 있음
import sec06.chap02.pkg3.*;


public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우
        //  구분 가기 어려울 때 전부 적어서 사용 가능
        sec06.chap02.pkg1.Child child1 = new sec06.chap02.pkg1.Child();
        sec06.chap02.pkg2.Child child2 = new sec06.chap02.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}
