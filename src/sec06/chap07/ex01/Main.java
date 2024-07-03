package sec06.chap07.ex01;
//  레코드(Java 16+)
//  데이터의 묶음을 저장하기 위한, 단순한 형태의 클래스
public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("홍길동", 2020, Gender.MALE);
        //  💡 toString 메소드 구현 (이후 배울 Object에서 상속받아 오버라이드)
        String childStr = child1.toString();

        Child[] children = new Child[] {
                new Child("김순이", 2021, Gender.FEMALE),
                new Child("이돌이", 2019, Gender.MALE),
                new Child("박철수", 2020, Gender.MALE),
                new Child("최영희", 2019, Gender.FEMALE),
        };

        for (Child child : children) {
            System.out.printf(
                    "%s %d년생 %s 어린이%n",
                    child.gender().getEmoji(),
                    child.birthYear(),
                    child.name()
            );
        }
    }
}
