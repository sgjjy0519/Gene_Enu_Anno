import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add("30"); 
		
		//Integer i = (Integer)list.get(2);
		String i = (String)list.get(2); // 형변환 생략가능, 
		
		System.out.println(list);
	}

}
