package sec05.chap07;
// **class final
public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다."; // ⚠️ 수정불가

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️ 불가, 집문서는 변경 불가
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능, 가구는 변경 가능
        store1.name = "선릉";
    }
}
