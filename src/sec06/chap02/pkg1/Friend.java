package sec06.chap02.pkg1;
//  Parent와 같은 패키지
public class Friend {
    Parent parent = new Parent();

    //  int aa = new Parent().a; // ⚠️ 불가
    // 💡 protected - 같은 패키지, 비 상속관계

    //  상속이 아니기 때문에 parent.b 로 인스턴스 만들어 사용 가능
    int bb = parent.b;
    int cc = parent.c;
    int dd = parent.d;
}
