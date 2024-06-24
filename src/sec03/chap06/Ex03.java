package sec03.chap06;

public class Ex03 {
    public static void main(String[] args) {
        //  트리밍
        String str3 = "\t 에 네 르 기 파!! \n";

        //  💡 trim : 앞뒤의 공백(white space) 제거
        String str4 = str3.trim();

        //////////////
        //  변수 그 자체에 적용하기
        //  - 문자열은 불변 : 변수가 가리키는 종이를 바꾸는 것
        str3 = str3.trim();

        //  문자 반환
        String str1 = "아야 슬슬 오함마 준비해야 쓰것다";

        //  💡 charAt : ~번째 문자 반환
        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(4);

        //  ⭐️ 마지막 문자 얻기
        char ch3 = str1.charAt(str1.length() - 1);

        // 문자(열)의 위치 반환
        String str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        //  💡 indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        //  앞에서부터 카운트해서 int로 반환

        //  두 번째 인자 : ~번째 이후/이전부터 셈
        int int1 = str2.indexOf('얄');
        int int2 = str2.indexOf('얄', 4);

        int  int3 = str2.indexOf("얄라");
        int  int4 = str2.lastIndexOf("얄라");
        int  int5 = str2.lastIndexOf("얄라", 12);

        //  💡 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('욜');
    }
}
