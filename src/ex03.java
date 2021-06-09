import java.util.*;

class Product{
	
}

class Tvv extends Product{
	
}

class Audioo extends Product{
	
}

public class ex03 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tvv> tvList = new ArrayList<Tvv>();
		
		productList.add(new Tvv());
		productList.add(new Audioo());
		
		tvList.add(new Tvv());
		tvList.add(new Tvv());
		
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
	}

}
