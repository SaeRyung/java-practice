package sec05.chap09.ex01;

public interface Hunter {
    // ⭐️ final - 초기화하지 않을 시 오류
    //  기본적으로 interface는 final로 인식
    String position = "포식자";
    //  추상메서드 hunt 가능
    //  초기화 반드시 구상.
    void hunt();
}

//  인터페이스(Hunter) 구상 시 당연히 메서드(void hunt) 구현 필수

