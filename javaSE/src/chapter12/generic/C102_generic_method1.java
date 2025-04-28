package chapter12.generic;

class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}

public class C102_generic_method1 {
	public static void main(String[] args) {
		// 제네릭 메서드
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이: " + rect);
		
	}
	
	// <T, V>는 타입 매개변수
	// T, V는 임의의 타입을 의미하며, 메서드가 호출될 때 구체적인 타입으로 대체 가능
	public static <T, V> double makeRectangle
			(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
}
