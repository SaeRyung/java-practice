package sec04.chap05;

import java.util.Arrays;

public class Ex05 {
    // 매개변수의 개수가 정해지지 않은 메소드
    public static void main(String[] args) {

        double avg = getAverage(3, 91, 14, 27, 4);
        //  💡 배열을 넣으면 자동으로 펼쳐져 인식됨
        //  배열로 선언해도 문제없이 작동
        int[] numbers = {3, 91, 14, 27, 4};
        double avgOfArr = getAverage(numbers);

        //////////////////////////////////
        String class3Desc = descClass(3, "목이진 선생님", "짱구, 철수, 유리, 맹구, 훈이");

        String[] kids = {"나루토", "사스케", "사쿠라"};

        String class3DescArr = descClass(3, "목이진", kids);
    }

    //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
    //  int[] (배열 자체를 받음)과는 다름!
    static double getAverage(int... nums){
        double result = 0.0;
        for(int num:nums){
            result += num;
        }
        return result/nums.length;
    }
    /////////////////////////////
    //  ⭐️ 다른(정해진) 인자들과 사용시 맨 마지막에 놓을 것
    //  마지막 한번만 사용가능, String ...teacher, String...kids X
    static String descClass(int classNo, String teacher, String...kids){
        return "%d 반의 담임은 %s 선생님, 원생들은 %s 입니다.".formatted(classNo, teacher, String.join(", ", kids));
    }
}
