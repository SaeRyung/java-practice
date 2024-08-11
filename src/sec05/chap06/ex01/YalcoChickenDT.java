package sec05.chap06.ex01;

public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    // extends 얄코치킨으로부터 기능 상속

    public YalcoChickenDT(int no, String name){
        super(no, name); //  다음 예제에서 다룰것
    }

    public void setDriveThruOpen(boolean driveThruOpen){
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder(){
        System.out.printf("%d 호 %s 점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가"));
    }
}
