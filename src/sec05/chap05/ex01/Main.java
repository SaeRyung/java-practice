package sec05.chap05.ex01;
//  상속
public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}

//  디버그 모드로 dtStore1 인스턴스 살펴볼 것
//  부모 클래스의 요소들 갖고 있음 확인 - 상속 inheritance
//  부모 클래스의 protected 필드들을 private 으로 바꿔 볼 것
//  💡 상속이 안 되는 것은 아님 - 자식클래스의 코드에서 사용하지 못할 뿐