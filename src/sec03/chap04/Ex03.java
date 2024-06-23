package sec03.chap04;

public class Ex03 {
    public static void main(String[] args) {
        //  단축평가
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3);
        //  && 두 식 전부 확인해야 하기 때문
        boolean bool2 = a < b || e++ < (f += 3);
        // || 하나만 확인하면 되기 때문에 뒤의 식 반환X

        boolean bool3 = a > b && c++ < (d += 3); // 🔴
        boolean bool4 = a > b || e++ < (f += 3);
    }
}
