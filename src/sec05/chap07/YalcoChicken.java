package sec05.chap07;

public class YalcoChicken {
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no; //아래에서 생성자에서 초기화 필수
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFiends(){
        // ⚠️ 불가
//        this.no++;
    }

    //  final 들어가면 자식에서 변경 불가, 고정
    public final void fryChicken(){
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
