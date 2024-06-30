package sec05.chap09.ex02;

public interface FoodSafety {
    //  ⭐️
    //  static 제거해 볼 것
    //  static abstract는 역시 불가 (추상 클래스처럼)

    //  FoodSafety 자체 기능, 공지. 매장의 기능X
    static void annoucement(){
        System.out.println("식품안전 관련 공지");
    }

    //  ⭐️
    //  default 제거해 볼 것

    //  default: 구상메소드(sout) 가능>  FoodSafety 자체 기능
    default void regularInspaction(){
        System.out.println("정기 체크");
    }

    void cleanKitchen();
    void employeeEducation();
}
