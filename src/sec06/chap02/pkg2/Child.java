package sec06.chap02.pkg2;

//  다른패키지에서 가져옴 > import 필요
import sec06.chap02.pkg1.Parent;

public class Child extends Parent {
    //  Parent와 다른 패키지
//      int aa = a; // ⚠️ 불가
//      int bb = b; // ⚠️ 불가

    // 💡 protected - 다른 패키지, 상속관계 사용가능
    int cc = c;
    int dd = d;


}
