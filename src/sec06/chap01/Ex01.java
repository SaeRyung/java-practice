package sec06.chap01;
//  **블록
//  프로그램에서 공유되는 개념
//  0개 이상의 문 statement 들을 묶은 단위
//  제어문, 함수, 클래스 등에 사용
//  새로운 스코프 생성
public class Ex01 {
    public static void main(String[] args) {
//  💡 { } 로 블록 생성
        {
            int x = 1;
            System.out.println(x);

        }

        String x = "전국구 보스";
        {
            String y = "동네 양아치";

            //  💡 블록 안쪽에서는 바깥의 것 사용 가능
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println(x);
//        System.out.println(y);  // ⚠️ 불가


        int z = 1;
        for(int i=0; i<5; i++){
            System.out.println(z + i);
        }
//        System.out.println(i); // ⚠️ 불가

    }
}
