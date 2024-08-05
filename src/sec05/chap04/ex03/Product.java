package sec05.chap04.ex03;

public class Product {

    //  전체 디폴트 적용, 변경X
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    /////////////  생성자 추가
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //////////////////  Getter and Setter
    // alt + Insert 키

    // name 반환. .get~~ 가져올 수 있도록.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()) return;
        this.name = name;
    }
//  할인율 discount를 적용한 값, 할인율 변경X
    public int getPrice() {
        return (int) (price *(1-discount));
    }

    public void setPrice(int place) {
        //  ⭐ this 사용 주의
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}

