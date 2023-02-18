package overloading;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume (5);
		Volume(3,4,5);
		Volume(3.14,6);
		}
		public static void Volume(int s) {
			int volume = (s*s*s);
			System.out.println("The volume of Cube is " + volume);
		
			
		}
		public static void Volume(int l,int b,int h) {
			int volume = (l*b*h);
			System.out.println("The volume of Cuboid is " + volume);
		
			
		}
		public static void Volume(double pi,int r) {
			double volume = ((4/3)*pi*r*r);
			System.out.println("The volume of Sphere is " + volume);
		
			
		}

}