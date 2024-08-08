package sec10.chap02;
// finally문
// 예외 발생 여부와 상관없이 반드시 실행할 코드
// 데이터베이스 연결을 열어 작업한 뒤 닫아줄 때 등에 사용
public class Ex02 {
    public static void main(String[] args) {
//        withFinally1(false);
//        System.out.println("\n- - - - -\n");
//        withFinally1(true);


        System.out.println("\n- - - - -\n");

        char char1 = withFinally2(3);
        char char2 = withFinally2(6);
    }


//    public static void withFinally1 (boolean makeException) {
//        try {
//            if (makeException) System.out.println("".charAt(0));
//            System.out.println("🎉 예외 없이 정상실행됨");
//        } catch (Exception e) {
//            System.out.println("🛑 예외 발생");
//        } finally {
//            System.out.println("🏁 무조건 실행");
//        }
//
//        //  ❓ 그냥 try 문 밖에 적으면 안 될까?
//        System.out.println("🏁 이렇게 말이지.");
//    }





    public static char withFinally2 (int index) {
        String str = "Hello";
        try {
            char result = str.charAt(index);
            System.out.println("🎉 예외 없이 정상실행됨");
            return result;
        } catch (Exception e) {
            System.out.println("🛑 예외 발생");
            return '!';
        } finally {
            //  ⭐️ 위에서 return이 발생하더라도 이건 하고 넘어감
            System.out.println("🏁 무조건 실행");
        }

        //  💡 try, catch 블록에 모두 return이 있으므로
        //  이 부분은 작성될 수 없음
//          System.out.println("🏁 이렇게 말이지.");
    }


}
