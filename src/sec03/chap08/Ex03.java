package sec03.chap08;

public class Ex03 {
    public static void main(String[] args) {
        //  *다중배열

        //  이중배열
        boolean[][] db1BoolAry = new boolean[3][3];

        int[][] db1IntAry = new int[][]{
                //  ⭐️ 요소 배열의 크기가 다를 수 있음
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        //  삼중배열
        char[][][] trpChrAry = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진','사'},{'오','미'}},
                {{'신','유'},{'술','해'}},
        };

        //////////////////////////
        int in1 = db1IntAry[0][1];
        int int2 = db1IntAry[2][3];
        int[] intAry = db1IntAry[1];

        char[][] db1ChrAry = trpChrAry[0];
        char[] chrAry = db1ChrAry[0];
        char chr1 = chrAry[1];
        char chr2 = trpChrAry[2][0][1];


    }
}
