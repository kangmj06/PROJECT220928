
public class Circle4 {
	int radius;
	String name;
	
	public Circle4() { 
		radius = 1; name = ""; 
	}
	public Circle4(int r, String n) {
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle4 pizza = new Circle4(10, "자바피자"); 
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		Circle4 donut = new Circle4(); 
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
