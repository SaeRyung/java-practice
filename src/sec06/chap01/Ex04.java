package sec06.chap01;

public class Ex04 {
    public static void main(String[] args) {
//        new Ex04().printKings();
    }

    String king = "사자";
    //  사자: 클래스 필드

    void printKings(){
        String king = "여우"; // 💡 그럼 이건 뭔가요?? 사자와 여우는 다르다.
        //  여우: 메소드 내 변수


        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf("인스턴스의 왕은 %s, 블록의 왕은 %s%n", this.king, king); //  this.king = 사자, king=여우
    }
}
