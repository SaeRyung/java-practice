package sec04.chap04;

public class Ex04 {
    public static void main(String[] args) {
        //  중첩 예제
        final int LINE_WIDTH;
        LINE_WIDTH = 5;

        int lineWidth = LINE_WIDTH;

        while(lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while(starsToPrint-- > 0){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n --------- \n");

        //  for문으로 다시 작성
//        for(int i=LINE_WIDTH; i>0; i--){
//            for(int j=i; i>0; j--){
//                System.out.println("@");
//            }
//            System.out.println();
//        }
    }
}
