import java.util.*;	
public class ex04 {

	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("장자바",1,1));
		list.add(new Student("정자바",1,2));
		list.add(new Student("종자바",2,1));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//Student s = (Student)it.next(); //11 라인에서 지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
			System.out.println(it.next().name);
		}

	}

}

class Student{
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}