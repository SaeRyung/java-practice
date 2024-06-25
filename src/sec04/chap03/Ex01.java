package sec04.chap03;

public class Ex01 {
    //  * for&for-each
    //  주어진 조건이 충족되는 동안 특정 작업 반복
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);  // 🔴
        }
        System.out.println("\n- - - - -\n");

///////////////////////////////
        //  루프 블록 안에서 변수값을 바꾸는 것으로 4번 과정 대신 가능
        for (int i = 0; i < 10;) {
            System.out.println(i);
            i += 2;
        }
////////////////////////////////
        System.out.println("\n- - - - -\n");

        for (double d = 123.45; d > 0; d -= 32.1) {
            System.out.println(d);
        }

        for (String s = ""; s.length() < 11; s += s.length()) {
            System.out.println(s);
        }
////////////////////////////////
        System.out.println("\n- - - - -\n");

        //  💡 쉼표로 구분하여 여럿 사용 가능
        //  ⚠️ 변수의 자료형은 한 종류만 가능 (혼용 안 됨)
        for (byte a = 0, b = 10; a <= b;) {
            System.out.printf("a: %d, b: %d%n", a++, b--);
        }

        System.out.println("\n- - - - -\n");
        int A = 0;
        double B = 10.0;

        for (;A <= B;) {
            System.out.printf("a: %d, b: %.0f%n", A++, B--);
        }

/////////////////////////////
        System.out.println("\n- - - - -\n");

        //  윷놀이 예제에 적용
        String yuts = "도개걸윷모";
        char yut = '도';

        boolean isValid = false;
        for (int i = 0; i <= yuts.indexOf(yut); i++) {
            isValid = true; // 문자열안에 값이 있으므로 true
            System.out.println("앞으로");
        }
        if (!isValid) System.out.println("무효");
    }
}
