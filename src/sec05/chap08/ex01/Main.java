package sec05.chap08.ex01;
//  **추상클래스,
//  스스로 인스턴스 만들 수 없음
//  자식클래스로 파생되기 위한 클래스
//  - 개, 고양이, 말 등의 클래스로서 인스턴스를 생성(구상클래스)
//  - 관련된 여러 클래스들의 공통분모를 정의하기 위한 클래스
public class Main {
    public static void main(String[] args) {
        //  ⚠️ 불가
        //  abstract 클래스이므로 매장 내지 않는다.
//        YalcoGroup yalcoGroup = new YalcoGroup(1, "서울");

        YalcoChicken ychStore1 = new YalcoChicken("판교");
        YalcoChicken ychStore2 = new YalcoChicken("강남");

        YalcoCafe ycfStore1 = new YalcoCafe("울릉", true);
        YalcoCafe ycfStore2 = new YalcoCafe("강릉", false);

        //  YalcoGroup 으로 상속되기 때문에 for문으로 넣기 가능
        YalcoGroup[] ycStores = {
                ychStore1, ychStore2,
                ycfStore1, ycfStore2
        };

        for (YalcoGroup ycStore : ycStores) {
            ycStore.takeOrder();
        }

        System.out.println("\n- - - - -\n");

        System.out.println(YalcoChicken.getCreed());
        System.out.println(YalcoCafe.getCreed());
    }
}
