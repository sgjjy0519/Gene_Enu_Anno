import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		HashMap<String, Studentt> map = new HashMap<String, Studentt>();
		map.put("장자바", new Studentt("장자바",1,1,100,100,100));
		
		Studentt s = map.get("장자바");
		
		
		System.out.println(s.name);
	}

}


class Studentt{
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Studentt(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}