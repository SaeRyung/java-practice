package sec06.chap02.pkg1;
//  Parent와 같은 패키지
public class Friend {
    Parent parent = new Parent();

    //  int aa = new Parent().a; // ⚠️ 불가
    // 💡 protected - 같은 패키지, 비 상속관계
    int bb = parent.b;
    int cc = parent.c;
    int dd = parent.d;
}
