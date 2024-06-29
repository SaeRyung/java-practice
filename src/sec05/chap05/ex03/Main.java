package sec05.chap05.ex03;
//  부모 클래스에 명시된 생성자가 없는 경우
//  자식 클래스에서도 작성할 필요 없음
public class Main {
    public static void main(String[] args) {
        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        slime.attack(fireSlime); // ⭐ 클래스가 다른데 가능한 이유 : 다음 강에서
        fireSlime.attack(slime);
    }
}
