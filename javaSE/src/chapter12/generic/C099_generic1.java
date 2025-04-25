package chapter12.generic;

class Coffee	{}
class Juice		{}

class BeverageBox {
	private Object[] beverage;
	
	public BeverageBox(Object[] beverage) {
		this.beverage = beverage;
	}
	
	public Object getBeverage(int index) {
		return beverage[index];
	}
}

class BeverageBox2<T> {
	private T[] beverage;
//	static T t; //static에서 불가!!!!!!!!!!!!!
	
	public BeverageBox2(T[] beverage) {
		this.beverage = beverage;
//		T t = new T();	// T타입으로 인스턴스 생성 불가
	}
	
	public T getBeverage(int index) {
		return beverage[index];
	}
}

public class C099_generic1 {
	public static void main(String[] args) {
		Coffee[] arr = {
				new Coffee(),
				new Coffee(),
		};
		BeverageBox box = new BeverageBox(arr);
		
		Coffee	coffee = (Coffee)	box.getBeverage(0);
//		Juice	juice	= (Juice)	box.getBeverage(1); // runtime error
		System.out.println(coffee);
		
		BeverageBox2<Coffee> box2 = 
				new BeverageBox2<Coffee>(arr);
		Coffee coffee2 = box2.getBeverage(0);
//		Juice coffee2 = box2.getBeverage(1); // compile error
		System.out.println(coffee2);
	}
}
