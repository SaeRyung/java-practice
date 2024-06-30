package sec05.chap09.ex01;

public class Main {
    public static void main(String[] args) {
        //  ⭐ 다형성, interface 적용
        PolarBear polarBear = new PolarBear();
        Mammal mammal = polarBear;
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        //  huner interface를 셋 다 적용하였으므로 배열에 사용 가능. 사냥을 하는 클래스들의 배열
        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        //  💡 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        for(Hunter hunter: hunters){
            hunter.hunt();
        }
    }
}
