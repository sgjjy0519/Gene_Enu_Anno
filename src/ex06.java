import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}
class Toy{
	public String toString() {
		return "Toy";
	}
}

interface Eatable{
	
}

public class ex06 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 타입불일치!
		//FruitBox<Toy> toyBox = new FruitBox<Toy>(); 타입불일치!
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); Grape은 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{
	
}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>(); //아이템을 저장할 리스트
	void add(T item) {  //박스에 아이템 추가
		list.add(item);
	}
	T get(int i) {	//박스에서 아이템을 꺼낼때
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}



