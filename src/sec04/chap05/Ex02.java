package sec04.chap05;

public class Ex02 {
    //  메소드 의미
    //  2. 값을 받고 연산하여 결과값을 반환 - 함수
    //  add 메소드 / num1,num2 변수(=인자) 외부에서 받아오는 것
    //  int 정수를 반환하는 메소드
    static int add(int num1, int num2){
        return num1 + num2;
    }

    static boolean checkIfContain(String text, String token){
        return text.toLowerCase().contains(token.toLowerCase());
    }

    public static void main(String[] args) {
        //  ⭐️ 반환한다는 것: 바꿔 쓸 수 있다는 것
        //  메서드 실행문을 메서드의 반환값으로 치환
        int int1 = add(2, 3);
        System.out.println(int1);

        System.out.println(add(4, 5));

        int int2 = add(add(6, 7), add(8, 9));
        System.out.println(int2);

        System.out.println("\n-------------\n");

        if(checkIfContain("Hello World", "hellow")){
            System.out.println("포함됌");
        }else{
            System.out.println("포함 안됌");
        }

        System.out.println("\n-------------\n");

        //  삼항연산자
        System.out.println(
                checkIfContain(
                        "hello world",
                        "hello"
                )? "포함됌" : "포함안됌"
        );

    }
}
