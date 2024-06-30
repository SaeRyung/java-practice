package sec05.chap08.ex02;

public class DropDown extends FormElement{
    String[] menus;

    public DropDown(int space, String[] menus) {
        super(space);
        this.menus = menus;
    }

    @Override
    void func() {
        for(String menu : menus){
            System.out.printf(" - %s%n", menu);
        }
    }
}
