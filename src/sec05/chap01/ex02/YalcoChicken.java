package sec05.chap01.ex02;
//  *클래스&인스턴스 - 프랜차이즈 본사&매장

//  본사 코드
//  본사에서 이런식으로 일한다.
public class YalcoChicken {
    //  인스턴스가 가질 필드(field)들
    //  자료형-변수 ; 필드
    //  필드: 각 매장이 갖고 있는 정보
    int no;
    String name;

    //  인스턴스가 가질 메소드 - 💡 static을 붙이지 않음
    //  매장들이 할 기능; 인사한다, 음식준다 등
    String intro(){
        //  no와 name 앞에 this를 붙인 것과 같음
        return "안녕하세요, %d호 %s점 입니다.".formatted(no, name);
    }
}

// ⭐ 클래스파일의 이름은 클래스의 이름과 동일해야 함 *(`public` 클래스일 시)*
// IntelliJ에서 클래스명 수정해 볼 것 - **refactor**
