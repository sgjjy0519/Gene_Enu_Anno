import java.util.ArrayList;

class Tv{
	
}

class Audio{
	
}

public class ex02 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
		list.add(new Tv());
//		list.add(new Audio());

		Tv t = list.get(0); //타입일치 (형변환 불필요)
	}

}
