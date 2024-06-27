package sec05.chap02.ex01;
//  슬라임 클래스
//  생성자를 필요로 하지 않음
//  필드들이 기본값을 가짐
//  인스턴스를 인자로 받는 메소드
public class Slime {
    double hp = 50;
    int attack = 8;
    double defense = 0.2;
    //  동일하게 이 값을 갖고 게임 시작하기에 생성자 X


    void attack(Slime enemy){  // 💡 다른 슬라임의 인스턴스를 인자로 받음
        enemy.hp -= attack * (1-enemy.defense);
    }
}
