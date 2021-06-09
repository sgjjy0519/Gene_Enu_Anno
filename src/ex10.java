class Parent{
	void parentMethod() {
		
	}
}

class Child extends Parent{
	//@Override - 조상의 메서드를 오버라이딩하는 것이라는 걸 컴파일러에 알려주는 역할
	@Deprecated  //- 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙임.
	void parentmethod() { //메서드 이름 잘몸됨 
		
	}
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상메서드만 가능
interface Testable{
	void test(); //추상메서드
//	void check(); //추상메서드
}

public class ex10 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentmethod(); // 에러는 나지않지만 권장X
	}
}
// 애너테이션은 알아내기 어려운 실수를 미연에 방지해주는 장점
//@Override - 조상의 메서드를 오버라이딩하는 것이라는 걸 컴파일러에 알려주는 역할
//@Deprecated - 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙임.
//@FunctionalInterface - 함수형 인터페이스에 붙이면 컴파일러가 올바르게 작성했는지 체크.
// 함수형 인터페이스는 하나의 추상메서드만 가져야한다는 제약이있음
//@SuppressWarnings - 컴파일러의 경고메시지가 나타나지 않게 억제. 괄호()안에 억제하고자 하는경고의 종류를 문자열로 지정
