package sec05.chap04.ex01;
//  public, private 접근제어자
public class SmartPhone {
    String powerButton = "OnOff";
    // default, 동일 패키지 안에서만
    public String sdCardSlot = "SD Card";
    //  public  다른 패키지도 가능
    private String cpu = "Yalcom";
    //  private 이 클래스 내에서만 활용 가능
}


