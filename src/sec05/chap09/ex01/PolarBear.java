package sec05.chap09.ex01;
//  추상클래스 Mammal
//  인터페이스 Hunter, Swimmer 기능 반드시 구현
public class PolarBear extends Mammal implements Hunter, Swimmer{
    public PolarBear(){
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + "물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}
