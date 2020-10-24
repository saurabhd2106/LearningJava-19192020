package day2;

public class DemoShape {

	public static void main(String[] args) {
		
		Shape shape = new Shape() {
			
			@Override
			public double calculateArea(int side) {
				
				return side * side * 0.5;
			}
		};
		
		System.out.println(shape.calculateVolume(10, 10));

		Cylinder cylinder = new Cylinder();

		double volumeOfCyl = cylinder.calculateVolume(10, 10);

		System.out.println("Cylinder Volume - " + volumeOfCyl);

		Shape cuboid = new Cuboid();

		double volumeOfCuboid = cuboid.calculateVolume(10, 10);

		System.out.println("Cylinder Volume - " + volumeOfCuboid);
	}

}
