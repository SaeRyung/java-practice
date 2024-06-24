package sec03.chap09;

public class Main {
    //  * 타입추론(Java 10+)
    //  var 연산자로 변수 선언 -> 타입을 명시하지 않음
    //      대입된 값을 통해 컴파일러가 추론
    //  지역변수에서만 사용 가능
    //      이후 배울 클래스의 필드로는 불가
    public static void main(String[] args) {
        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕하세요" + 1 + true; // 복합적인 타입들이 들어갈때 한눈에 판단하기 어려움
        // var : 타입을 추론함

        //  ⚠️ 아래와 같이는 사용 불가
        //  컴파일러가 타입을 추론할 수 없는 상황
//        var notInit; //초기화 안됌
//        var nullVar = null; //null로 초기화


        ///////////////////////
        //  ⚠️ 자료형을 변경 불가
//        intNum = 1.23;
//        Stringword = 123;

        /////////////////////////
        //  이후 배울 반복문에서 편리하게 사용
        for(var i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("\n ---------------- \n");

        ////////////////////////////
        //  배열의 경우 초기화시에 명시
        var chars = new char[]{'A', 'B', 'C', 'D', 'E'};
//        var chars2 = {'A', 'B', 'C', 'D', 'E'};  //불가

        for(var c:chars){
            System.out.println(c);
        }
    }
}
