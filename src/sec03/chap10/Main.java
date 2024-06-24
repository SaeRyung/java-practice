package sec03.chap10;

public class Main {
    //  *비트연산자
    public static void main(String[] args) {
        int x = 5; // 00101
        int y = 19; // 10011

        int x_and_y = 5 & 19;

        //  && || 단축 평가O
        //  & |  단축 평가X
        //  비트연산이 산술보다 빠른경우가 있다. 각자 환경에서 테스트 후 더 알맞는 것 사용

        //  비트마스킹, 소규모에서 간단
        //  스펙 지원 여부
        int WIFI = 1;
        int PEN = 1 << 1;
        int CAMERA = 1 << 2;
        int SDCARD = 1 << 3;

        int tablet_1 = PEN | SDCARD;

        int tablet_2 = WIFI | CAMERA | SDCARD;

        boolean t1_HasPen = (tablet_1 & PEN) > 0;
        boolean t1_HasCamera = (tablet_1 & CAMERA) > 0;

        boolean t2_HasWifi = (tablet_2 & WIFI) > 0;
        boolean t2_HasPen = (tablet_2 & PEN) > 0;


        //  스펙 변경
        //  추가
        tablet_1 |= CAMERA;
        boolean t1_HasCamera2 = (tablet_1 & CAMERA) > 0;

        //  삭제
        tablet_2 &= ~WIFI;
        boolean t2_HasWife2 = (tablet_2 & WIFI) > 0;

        //  토글
        boolean t2_HasWifi3 = (tablet_2 & WIFI) > 0;

        tablet_2 ^= WIFI;
        boolean t2_HasWifi4 = (tablet_2 & WIFI) > 0;
    }
}
