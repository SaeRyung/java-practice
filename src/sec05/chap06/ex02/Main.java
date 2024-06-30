package sec05.chap06.ex02;

//  상속
public class Main {
    public static void main(String[] args) {
        YalcoChicken ycStores[] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "강남"),
                new YalcoChickenDT(108, "철원"),
        };

        for(YalcoChicken store: ycStores){
            if(store instanceof YalcoChickenDT){
                //  ⭐️ 자식 클래스의 기능을 사용하려면 명시적 타입 변환
                ((YalcoChickenDT)store).takeDTOrder();
            }else{
                store.takeHallOrder();
            }
        }
    }
}

//  디버그 모드로 dtStore1 인스턴스 살펴볼 것
//  부모 클래스의 요소들 갖고 있음 확인 - 상속 inheritance
//  부모 클래스의 protected 필드들을 private 으로 바꿔 볼 것
//  💡 상속이 안 되는 것은 아님 - 자식클래스의 코드에서 사용하지 못할 뿐