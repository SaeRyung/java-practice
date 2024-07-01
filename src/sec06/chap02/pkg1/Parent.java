package sec06.chap02.pkg1;

public class Parent {
    //  서로 다른 접근제어자

    //  private 자식클래스에서도 사용X
    //  상속을 받으나 자식클래스 내부에서 사용X
    private int a = 1;

    //  default
    int b = 2;
    //  protected
    protected int c = 3;
    //public
    public int d = 4;
}
