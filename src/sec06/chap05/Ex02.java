package sec06.chap05;
//  **매개변수 전달하여 활용하기
//  외부에서 입력한 인자 받아와서 적용할 수 있다.
public class Ex02 {
    public static void main(String[] args) {
        for(String arg: args){
            System.out.println(arg);
        }
    }
}
