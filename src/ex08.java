//                0      1     2     3
enum Direction {EAST, SOUTH, WEST, NORTH}; // 열겨형 정의  -- 모두 객체!

public class ex08 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST; //열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST"); //열거형 상수의 이름을 문자열로 변환
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? " + (d1==d2)); //false
		System.out.println("d1==d3 ? " + (d1==d3)); //true
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? "+ (d1 > d3)); //에러 - 열거형 상수에 비교연산자 사용불가
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3))); //compareTo()는 가능
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));
		
		switch(d1) {
		case EAST: //Direction.EAST 라고 쓸 수 없음!
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;	
		default:
			System.out.println("Invalid direction.");
			break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) { //for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
			 // d.name() => 열거형상수 문자열로 반환 , d.ordinal() => 열거형 상수가 정의된 순서반환(0부터)
		}
	}

}
