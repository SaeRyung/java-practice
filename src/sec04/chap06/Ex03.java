package sec04.chap06;
//  재귀 메소드
//  스스로를 호출하는 메소드
//  호출시마다 메모리에 스택이 축적 - 초과시 오버플로우 stack overflow 에러
public class Ex03 {
    public static void main(String[] args) {
        upTo5(0);
        upTo5(2);
        upTo5(4);
        //  다른 메소드를 호출한 메소드는 호출된 메소드가 종료될 때까지 메모리에 남아있음
        //  호출이 반복될수록 위와 같이 메소드들이 쌓이게 됌
        //  재귀반복 -> 용량 한계 -> 스택 오버틀로우 이슈 발생할 수 있음.

        int fact1 = factorial(1);
        int fact2 = factorial(2);
        int fact3 = factorial(3);
        int fact4 = factorial(4);
        int fact5 = factorial(5);

//      재귀 코드를 내부적으로 루프 형태로 바꿔서 스택이 쌓이지 않도록 함
//      ⚠️ 자바에서는 현재 기본적으로 제공하지 않음 (보안 등 문제…)
//      반복 횟수가 너무 많아지는 작업에는 사용하지 말 것!
    }

    //  심부름 속의 심부름이 있다.
    static void upTo5(int start){
        System.out.println(start);
        if(start < 5){
            upTo5(++start); //  재귀
        }else{
            System.out.println("--재귀종료--");
        }
    }

    static int factorial(int num){
        return num == 0 ? 1 : num * factorial(--num);
    }
}
