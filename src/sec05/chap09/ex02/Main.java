package sec05.chap09.ex02;

public class Main {
    public static void main(String[] args) {

        //  FoodSafety 식약청 자체 공지
        FoodSafety.annoucement();

        YalcoChicken store1 = new YalcoChicken();

        //  regularInspaction > FoodSafety class 내 default 메서드로 구현되어 사용 가능.
        store1.regularInspaction();

        store1.cleanKitchen();
        store1.employeeEducation();
    }
}
