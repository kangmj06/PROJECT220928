import java.util.Scanner;

class Circle3{
	private double x,y;
	private int radius;
	public Circle3(double x, double y, int radius) {
		 this.x = x;
		 this.y =y;
		 this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
	public int getRadius() {
	      return radius;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle3 c []= new Circle3[3];
		int max=0;
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle3(x,y,radius);
		}
		 for(int i=0; i<c.length; i++) 
	         if(max < c[i].getRadius())
	            max = c[i].getRadius();
		 for(int i=0;i<c.length;i++)
			if(max == c[i].getRadius()) {
	            System.out.print("가장 면적인 큰 원은 ");
	            c[i].show();
			}
		scanner.close();
	}
}