package sec07.ex04;
//  **clone 메소드
//  인스턴스가 스스로를 복제하기 위해 사용
//  Cloneable 인터페이스 구현 권장
//  깊은 복사는 직접 오버라이드 하여 구현해야함
public class Main {
    public static void main(String[] args) {
        NotCloneable notCloneable = new NotCloneable(
                "클릭들 1", 1, new int[] {1, 2, 3},
                new Click(12, 34),
                new Click[] { new Click(12, 34), new Click(56, 78) }
        );

        NotCloneable clone1 = null;

        try { // ❓ try 문 : 오류에 대비하기 섹션에서 배울 것
            clone1 = (NotCloneable) notCloneable.clone();
        } catch (CloneNotSupportedException e) {
            System.out.printf("⚠️ 복제중 오류 발생 : %s%n", notCloneable);
        }
        //  ⚠️ 복사 실패 - CloneNotSupportedException 이라는 오류 발생
    }
}
